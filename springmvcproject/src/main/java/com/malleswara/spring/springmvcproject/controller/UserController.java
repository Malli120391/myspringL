package com.malleswara.spring.springmvcproject.controller;

//import java.io.Reader;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;

import com.malleswara.spring.springmvcproject.dto.User;

@Controller
public class UserController {
	
	@RequestMapping("registrationPage")
	public String showRegisterPage() {
		return "userReg";
		//ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("userReg");
		
		//return modelAndView;
		 
	}
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);
		
		//ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject("user", user);
		//modelAndView.setViewName("userReg");
		//modelAndView.setViewName("regResult");
		model.addAttribute("user", user);
		
		return "regResult";
}
}

