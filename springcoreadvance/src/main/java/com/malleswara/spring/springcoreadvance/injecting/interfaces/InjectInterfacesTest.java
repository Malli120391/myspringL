package com.malleswara.spring.springcoreadvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectInterfacesTest {

	public static void main(String[] args) {

		ApplicationContext con = 
				new ClassPathXmlApplicationContext("com/malleswara/spring/springcoreadvance/injecting/interfaces/injinterfacesconfig.xml");
		OrderBO orderbo =(OrderBO) con.getBean("bo");
		orderbo.placeOrder();
		
	}

}
