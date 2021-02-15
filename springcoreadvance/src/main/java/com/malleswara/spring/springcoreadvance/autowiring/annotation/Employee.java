package com.malleswara.spring.springcoreadvance.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
/* @Autowired
  Employee(Address address){
	 this.address=address;
  }*/
	
	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	public Address getAddress() {
		return address;
	}
	/*@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}*/
@Autowired(required = false)
@Qualifier("address123")
private Address address;
	

}
