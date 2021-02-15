package com.malleswara.spring.springcoretest.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) con.getBean("carDealer");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModel());
		
	}

}
