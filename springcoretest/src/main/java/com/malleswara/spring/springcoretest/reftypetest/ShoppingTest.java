package com.malleswara.spring.springcoretest.reftypetest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingTest {

	public static void main(String[] args) {

		ApplicationContext  cont = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/reftypetest/shopconfig.xml");
		ShoppingCar shopping = (ShoppingCar) cont.getBean("shoppingcart");
		System.out.println(shopping);
		
	}

}
