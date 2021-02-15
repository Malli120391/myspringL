package com.malleswara.spring.springcoreadvance.standalone.collections;

import java.util.List;

public class ProdtucstList {
	
	private List<String> productName;

	public List<String> getProductname() {
		return productName;
	}

	public void setProductname(List<String> productname) {
		this.productName = productname;
	}

	@Override
	public String toString() {
		return "ProdtucstList [productName=" + productName + "]";
	}

}
