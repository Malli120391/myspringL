package com.malleswara.spring.springcore.constructorinjection.ambeguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddTest {

	public static void main(String[] args) {

		ApplicationContext cont = new ClassPathXmlApplicationContext("com/malleswara/spring/springcore/constructorinjection/ambeguity/ambconfig.xml");
		Ambiguity add = (Ambiguity) cont.getBean("addition");
		System.out.println(add);
	}

}
