package com.malleswara.spring.springcoreadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOder() {

		System.out.println("Inside Order DAO createOrder");
		
	}

}
