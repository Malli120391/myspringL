package com.malleswara.spring.springcoretest.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTestnestedbean {

	public static void main(String[] args) {

		ApplicationContext amp = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/innerbean/innerbeanconfig.xml");
		Employee empinnerbean = (Employee) amp.getBean("employee");
		System.out.println(empinnerbean.hashCode());
		
		Employee empinnerbean2 = (Employee) amp.getBean("employee");
		System.out.println(empinnerbean2.hashCode());
		
	}

}
