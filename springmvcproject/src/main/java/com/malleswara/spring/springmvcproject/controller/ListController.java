package com.malleswara.spring.springmvcproject.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.malleswara.spring.springmvcproject.dto.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/readList")
	public ModelAndView sendobject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Malleswara");
		employee.setSalary(10000);
		
		Employee employee1 = new Employee();
		employee1.setId(2);
		employee1.setName("APJ");
		employee1.setSalary(100000);
		
		Employee employee2 = new Employee();
		employee2.setId(3);
		employee2.setName("AK");
		employee2.setSalary(1000000);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		
		modelAndView.addObject("employees", employees);
		
		
		return modelAndView;
		
		
		
		
	}

}
