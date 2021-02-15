package com.malleswara.spring.javabased.configuration;

public class HelloWorld {
	
	private String message;

	public void getMessage() {
		System.out.println("My Message: "+ message);
		
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
