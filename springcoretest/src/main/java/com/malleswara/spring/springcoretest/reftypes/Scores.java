package com.malleswara.spring.springcoretest.reftypes;

public class Scores {
	
	private String maths;
	private String physics;
	private String chemistry;
	
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getPhysics() {
		return physics;
	}
	public void setPhysics(String physics) {
		this.physics = physics;
	}
	public String getChemistry() {
		return chemistry;
	}
	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}
	
	
	  @Override
	  public String toString() {
		  
		  return "Scores [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]"; 
		  }	

}
