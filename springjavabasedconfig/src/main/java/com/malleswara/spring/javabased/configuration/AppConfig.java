package com.malleswara.spring.javabased.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
     public HelloWorld helloWorld() {
    	 HelloWorld  helloWorld = new HelloWorld();
    	 helloWorld.setMessage("Spring Java Based COnfiguration..........");
		return helloWorld;
    	 
    	 
     }
}
