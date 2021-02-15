package com.malleswara.spring.springcoretest.dependenceycheck;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrescriptionTest {

	public static void main(String[] args) {

		
		ApplicationContext apct = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/dependenceycheck/depenconfig.xml");
	Prescription pre = (Prescription) apct.getBean("prescription");
	System.out.println(pre);
	
	//CommonAnnotationBeanPostProcessor
	}

}
