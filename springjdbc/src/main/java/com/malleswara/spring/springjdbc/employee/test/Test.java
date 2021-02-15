package com.malleswara.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;

import com.malleswara.spring.springjdbc.employee.dao.EmployeeDao;
import com.malleswara.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext contxt = new ClassPathXmlApplicationContext("com/malleswara/spring/springjdbc/employee/test/daoconfig.xml");
		EmployeeDao dao = (EmployeeDao) contxt.getBean("employeedao");
	//Employee employee = new Employee();
	//employee.setId(2);
	//employee.setFirstName("Kalam");
	//employee.setLastName("Abdul");
	//int result = dao.create(employee);
	//int result = dao.update(employee);
	//int result = dao.delete(1);
	//Employee employee = dao.read(2);
		
		List<Employee> result = dao.read();
		System.out.println("Employee Read: " + result);
		
		
		/*
		 * for(Employee result : dao.read()) {
		 * 
		 * System.out.println("Employee Record: " +result);
		 * 
		 * }
		 */

}
}
