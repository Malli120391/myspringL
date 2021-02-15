package com.malleswara.spring.springmvcorm.user.dao;

import java.util.List;

import com.malleswara.spring.springmvcorm.user.entity.User;

public interface UserDao {
	
	int create(User user);
	List<User> findUser();
	
	User findUser(Integer id);

}
