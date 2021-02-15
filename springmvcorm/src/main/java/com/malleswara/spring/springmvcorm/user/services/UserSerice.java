package com.malleswara.spring.springmvcorm.user.services;

import java.util.List;

import com.malleswara.spring.springmvcorm.user.entity.User;

public interface UserSerice {

	int save(User user);
	
	List<User> getUsers();
	
	User getUser(Integer id);
	
}
