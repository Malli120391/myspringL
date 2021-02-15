package com.malleswara.spring.springcoretest.cl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CaLTest {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/cl/clconfig.xml");
		CountriesandLanguages cal = (CountriesandLanguages) ap.getBean("cl");
		System.out.println(cal.getProanslangs());
		

	}

}
