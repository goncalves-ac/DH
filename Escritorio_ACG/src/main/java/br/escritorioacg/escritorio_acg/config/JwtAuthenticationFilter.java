package br.escritorioacg.escritorio_acg.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import br.escritorioacg.escritorio_acg.service.TokenAuthenticationService;

public class JwtAuthenticationFilter extends GenericFilterBean {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Authentication auth = TokenAuthenticationService.getAuthentication((HttpServletRequest) request);
		
		SecurityContextHolder.getContext().setAuthentication(auth);
		chain.doFilter(request, response);
	}

}
