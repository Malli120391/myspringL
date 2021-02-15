package com.malleswara.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.malleswara.spring.springorm.product.dao.ProductDao;
import com.malleswara.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/malleswara/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		/*Product product = new Product();
		product.setId(101);
		product.setName("Malleswara");
		product.setDesc("hibernate with srping");
		product.setPrice(800);
		productDao.create(product);
		productDao.update(product);
		productDao.delete(product);
		
		*/
          // Product product = productDao.find(2);
		//List<Product> findAll = productDao.findAll();
		
		for(Product p : productDao.findAll()) {
		
           System.out.println(p);
           
		}
		
	}

}
