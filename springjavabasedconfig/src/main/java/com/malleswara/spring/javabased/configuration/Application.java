package com.malleswara.spring.javabased.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld helloworldObj = (HelloWorld) acac.getBean("helloWorld");
		helloworldObj.getMessage();
		acac.close();
	}

}