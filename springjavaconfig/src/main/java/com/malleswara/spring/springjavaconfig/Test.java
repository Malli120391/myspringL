package com.malleswara.spring.springjavaconfig;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service dao = context.getBean(Service.class);
		dao.hashCode();
		//Service dao1 = context.getBean(Service.class);
		
		dao.save();
		context.close();
		
	}

}
