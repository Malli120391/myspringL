package com.malleswara.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructTest {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/malleswara/spring/springcore/constructorinjection/constconfig.xml");
		Employee empconstruct = (Employee) context.getBean("employee");
		System.out.println(empconstruct);
		
	}

}
