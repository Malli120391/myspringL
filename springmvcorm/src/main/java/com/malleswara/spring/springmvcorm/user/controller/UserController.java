package com.malleswara.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.malleswara.spring.springmvcorm.user.entity.User;
import com.malleswara.spring.springmvcorm.user.services.UserSerice;
//import com.malleswara.spring.springmvcproject.dto.User;

@Controller
public class UserController {
	
	@Autowired
	private UserSerice service;

	public UserSerice getService() {
		return service;
	}

	public void setService(UserSerice service) {
		this.service = service;
	}
	
	@RequestMapping("registrationPage")
	public String showRegisterPage() {
		return "userReg";
		 
	}
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		//System.out.println(user);
		//model.addAttribute("user", user);
		int result = service.save(user);
		model.addAttribute("result", "User created with Id" +result);
		
		return "userReg";
}
	@RequestMapping("getUsers")
	public String getUser(ModelMap model) {
		List<User> users = service.getUsers();
		model.addAttribute("users", users);
		return "displayUsers";
		 
	}
	@RequestMapping("validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {
		
		User user = service.getUser(id);
		String msg="";
		
		if(user!=null) {
			msg= id+"already exits";
			
		}
		
		return msg;
		
	}
}
