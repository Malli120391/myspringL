package com.malleswara.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext contxt = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) contxt.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
	int result =	jdbcTemplate.update(sql, new Integer(1),"Chennu", "Malleswararao");
	System.out.println("Number of records inserted: " +result);
	
	}

}
