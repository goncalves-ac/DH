package br.escritorioacg.escritorio_acg.config;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.escritorioacg.escritorio_acg.entities.AccountCredencials;
import br.escritorioacg.escritorio_acg.service.TokenAuthenticationService;

public class JwtLoginFilter extends AbstractAuthenticationProcessingFilter{
	
	protected JwtLoginFilter(String url, AuthenticationManager authManager) {
		super(new AntPathRequestMatcher(url));
		setAuthenticationManager(authManager);
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {
		AccountCredencials credencials = new ObjectMapper()
				.readValue(request.getInputStream(), AccountCredencials.class);
		
		return getAuthenticationManager().authenticate(
				new UsernamePasswordAuthenticationToken(
						credencials.getUsername(),
						credencials.getPassword(),
						Collections.emptyList()
				)
		);
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		TokenAuthenticationService.addAuthentication(response, authResult.getName());
	}
}
