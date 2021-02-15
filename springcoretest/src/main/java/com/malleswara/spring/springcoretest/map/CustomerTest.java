package com.malleswara.spring.springcoretest.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/map/cusconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer.getId());
		System.out.println(customer.getProducts());
		
	}

}
