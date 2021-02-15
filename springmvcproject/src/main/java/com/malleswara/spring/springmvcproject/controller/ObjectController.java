package com.malleswara.spring.springmvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.malleswara.spring.springmvcproject.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
	public ModelAndView sendobject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Malleswara");
		employee.setSalary(10000);
		modelAndView.addObject("employee", employee);
		
		
		return modelAndView;
		
		
		
		
	}

}
