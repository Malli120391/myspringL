package com.malleswara.spring.springcoretest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configtestroot.xml");
    	Employeetest emp=(Employeetest) context.getBean("emp");
    	System.out.println("Employee Id:" + emp.getId());
    	System.out.println("Employee Name:" + emp.getName());
    	
    }
}
