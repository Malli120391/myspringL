package com.malleswara.hibernate.hibernateorm;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;

import com.javaguides.hibernate.entity.Student;
import com.javaguides.hibernate.util.HibernateUtil;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Student student = new Student(1,"Malleswara", "chennu", "ch.malli1203@gmail.com");
        Student student1 = new Student(2,"Sandeep", "chippala", "ch.sandeep@gmail.com");
        Student student2 = new Student(3,"Naresh", "undela", "u.naresh@gmail.com");
        Student student3 = new Student(4,"Mohan", "chelle", "ch.mohan@gmail.com");
        Student student4 = new Student(5,"Anil", "Kokkiligadda", "k.anil@gmail.com");
        
        Transaction transaction = null;
        
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
        	transaction = (Transaction) session.beginTransaction();
        	
        	session.save(student);
        	session.save(student1);
        	session.save(student2);
        	session.save(student3);
        	session.save(student4);
       
        	transaction.commit();
        	
        } catch (Exception e) {
        	if(transaction != null) {
        		transaction.rollback();
        	}
			
			e.printStackTrace();
		
		}
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List < Student > students = session.createQuery("from Student", Student.class).list();
            students.forEach(s -> System.out.println(s.getFirstName()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    }

