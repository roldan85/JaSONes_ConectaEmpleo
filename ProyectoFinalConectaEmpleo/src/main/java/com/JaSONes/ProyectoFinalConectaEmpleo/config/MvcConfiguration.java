package com.JaSONes.ProyectoFinalConectaEmpleo.config;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
@ComponentScan(basePackages="com.JaSONes.ProyectoFinalConectaEmpleo")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp().prefix("WEB-INF/views").suffix(".jsp");
	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource source = new  ResourceBundleMessageSource();
		return source;
	}
	
	
}
