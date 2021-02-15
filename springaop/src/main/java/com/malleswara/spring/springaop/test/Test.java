package com.malleswara.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.malleswara.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/malleswara/spring/springaop/test/stuconfig.xml");
		ProductService productService = (ProductService) context.getBean("ProductService");
		System.out.println(productService.multiply(5, 5));
	}

}
