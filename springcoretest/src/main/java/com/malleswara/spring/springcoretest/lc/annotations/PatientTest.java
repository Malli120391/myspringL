package com.malleswara.spring.springcoretest.lc.annotations;

//import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientTest {

	public static void main(String[] args) {

		AbstractApplicationContext pcont = new ClassPathXmlApplicationContext("com/malleswara/spring/springcoretest/lc/annotations/pconfig.xml");
		Patient p = (Patient) pcont.getBean("patient");
		System.out.println(p);
		pcont.registerShutdownHook();
		
		//CommonAnnotationBeanPostProcessor
	}

}
