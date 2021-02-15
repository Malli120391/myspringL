package com.malleswara.spring.springcoretest.innerbean;

public class Address {
	
	private String hno;
	private String Street;
	private String city;
	
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", Street=" + Street + ", city=" + city + "]";
	}
	
	
	
	

}
