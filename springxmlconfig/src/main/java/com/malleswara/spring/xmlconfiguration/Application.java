package com.malleswara.spring.xmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springxmlconfigu.xml");
		HelloWorld helloobj = (HelloWorld) context.getBean("helloworld");
		helloobj.getMessage();
		
		
		
	}

}
