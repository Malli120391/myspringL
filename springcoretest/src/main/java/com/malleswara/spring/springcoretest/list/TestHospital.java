package com.malleswara.spring.springcoretest.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/list/listconfig.xml");
		Hospital hp = (Hospital) ctx.getBean("hospital");
		System.out.println(hp.getName());
		System.out.println(hp.getDepartments().getClass());
		
	
	}

}
