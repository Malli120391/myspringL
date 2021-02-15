package com.malleswara.spring.springcoreadvance.autowiring.annotation.exmple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExmTest {

	public static void main(String[] args) {
		
		ApplicationContext cont = 
	new ClassPathXmlApplicationContext("com/malleswara/spring/springcoreadvance/autowiring/annotation/exmple/configexmp.xml");
   Customer cust = (Customer) cont.getBean("customer");
   System.out.println(cust);
   
	}

}
