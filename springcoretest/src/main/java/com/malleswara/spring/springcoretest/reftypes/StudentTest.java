package com.malleswara.spring.springcoretest.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
 
		ApplicationContext reftypecontext = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/reftypes/stuconfig.xml");
		
		Student ssc= (Student) reftypecontext.getBean("student");
		System.out.println(ssc);
		
	}

}
