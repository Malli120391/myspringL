package com.malleswara.spring.springcoreadvance.instructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SterotypeAnnoTest {

	public static void main(String[] args) {
     
		ApplicationContext acon =
				new ClassPathXmlApplicationContext("com/malleswara/spring/springcoreadvance/instructor/sterotypeannoconfig.xml");
		
		Instructor inst = (Instructor) acon.getBean("inst");
		System.out.println(inst);
		
		Instructor inst1 = (Instructor) acon.getBean("inst");
		System.out.println(inst1);
		
		//System.out.println(Integer.MIN_VALUE);
	}

}
