package com.malleswara.spring.springcoretest.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter method");
		this.id = id;
	}
	
	public void hi() {
		System.out.println("hello init method");
	}
	public void bye() {
		System.out.println("bye destroy");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
System.out.println("inside afterpropertiesset()");		
	}

	@Override
	public void destroy() throws Exception {
System.out.println("inside destroy()");

	}
	

}
