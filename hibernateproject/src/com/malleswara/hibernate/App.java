package com.malleswara.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.malleswara.hibernate.example.UsersTest;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(UsersTest.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			//UsersTest userstest = new UsersTest("username", "password", "firstName", "lastName");
			//UsersTest userstest = new UsersTest();
			session.beginTransaction();
			
			//session.createQuery("update userstest set password = '123'" + " where first_name = 'ch' ")
			//.executeUpdate();
			
			session.createQuery("delete from userstest where user_id = '5' ").executeUpdate();
			
			
		/*List<UsersTest> users =	
				session.createQuery("from userstest where first_name = 'chenn'" + "OR last_name = 'green' ")
				.getResultList();
			
			for (UsersTest usersTest : users) {
				System.out.println(usersTest);
				
				
			}
			
			*/
			
	
			
			//session.save(userstest);
			//userstest = session.get(UsersTest.class, 8);
			//userstest.setUsername("admin@test.com");
			
			//session.delete(userstest);
			
			session.getTransaction().commit();
			//System.out.println(userstest);
			
			
		} finally {
			session.close();
			factory.close();
		}
	}
}