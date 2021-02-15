package com.malleswara.spring.springcoretest.innerbeanexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityTest {

	public static void main(String[] args) {

		ApplicationContext cntx = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/innerbeanexample/uniconfig.xml");
		University uni = (University) cntx.getBean("university");
		System.out.println(uni.hashCode());
		
		University uni2 = (University) cntx.getBean("university");
		System.out.println(uni2.hashCode());
		
	}

}
