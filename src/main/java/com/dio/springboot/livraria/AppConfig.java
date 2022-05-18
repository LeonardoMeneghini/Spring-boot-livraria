package com.dio.springboot.livraria;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Livro getLivro() {
		return new Livro();
	}
	// Siginifcado do bean: 
	//<bean id="livro" class="com.springbeans.Livro"/>
	//
	

}
