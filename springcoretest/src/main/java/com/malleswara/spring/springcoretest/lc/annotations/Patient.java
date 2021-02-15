package com.malleswara.spring.springcoretest.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

public class Patient{
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter method");
		this.id = id;
	}
	@PostConstruct
	public void hi() {
		System.out.println("hello init method");
	}
	@PreDestroy
	public void bye() {
		System.out.println("bye destroy");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	
	

}
