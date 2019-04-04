package com.JaSONes.ProyectoFinalConectaEmpleo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class InitializerConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context;
		context	= new AnnotationConfigWebApplicationContext();
		context.setConfigLocation("com.telefonica.SpringMVC");
		
		container.addListener(new ContextLoaderListener(context));
		//Indicamos quien es el DispatcherServlet 
        ServletRegistration.Dynamic dispatcher = container
          .addServlet("dispatcher", new DispatcherServlet(context));
         
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
		

	}
	

}
