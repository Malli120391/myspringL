package com.malleswara.spring.springcoretest.lc.xmlconfig;

public class Patient {
	
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
	

}
