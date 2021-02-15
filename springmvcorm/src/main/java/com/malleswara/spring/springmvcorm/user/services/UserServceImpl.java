package com.malleswara.spring.springmvcorm.user.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.malleswara.spring.springmvcorm.user.dao.UserDao;
import com.malleswara.spring.springmvcorm.user.entity.User;

@Service
public class UserServceImpl implements UserSerice {
	
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		//Besiness logic
		return dao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> user = dao.findUser();
		
		Collections.sort(dao.findUser());
		return user;
		
	}

	@Override
	public User getUser(Integer id) {
		return dao.findUser(id);
	}

}
