package com.jbk.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.entity.Employee;
import com.jbk.entity.Job;

public class MainClass {

	public static void main(String[] args) {
		
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(Employee.class);
	config.addAnnotatedClass(Job.class);
	
    SessionFactory factory=	config.buildSessionFactory();
      Session session = factory.openSession();
      session.beginTransaction();
      
      Job j=new Job ("Web Devloper");
     
      Employee f=new Employee();
      f.setName("Abhishek Ekal ");
      f.setEmail_id("AbhishekEkal767@gmail.com");
      f.setJob(j);
      
      session.persist(f);
      session.persist(j);
      
      session.getTransaction().commit();
      session.close();
      
	
	}

}
