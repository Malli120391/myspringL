package com.malleswara.spring.springcoreadvance.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneTest {

	public static void main(String[] args) {

		ApplicationContext apcont = 
		new ClassPathXmlApplicationContext("com/malleswara/spring/springcoreadvance/standalone/collections/stclconfig.xml");
		ProdtucstList pl = (ProdtucstList) apcont.getBean("productslist");
		System.out.println(pl);
		
		
	}

}
