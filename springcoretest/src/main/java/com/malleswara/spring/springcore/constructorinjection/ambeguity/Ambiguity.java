package com.malleswara.spring.springcore.constructorinjection.ambeguity;

public class Ambiguity {
	
	
	Ambiguity(int a, double b){
		System.out.println("inside the constructor");
		System.out.println(a);
		System.out.println(b);
	}
	/*Ambiguity(int a, int b){
		System.out.println("inside constructor INT");
	}
	
	Ambiguity(String a, String b){
		System.out.println("inside constructor String");
	}*/
	

}
