package com.malleswara.spring.springcoreadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImple2 implements OrderDAO {

	@Override
	public void createOder() {

		System.out.println("Inside OrderDAOImple2 createOrder");
	}

}
