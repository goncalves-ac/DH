package br.escritorioacg.escritorio_acg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class EscritorioAcgApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscritorioAcgApplication.class, args);
	}

}
