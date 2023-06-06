package com.cgg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EMDemo {

	public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	//create student object
	
	Student student=new Student();
	student.setId(102);
	student.setName("abc1");
	student.setCity("hyd1");
	
	//create certificate object
	
	Certificate certi= new Certificate();
	certi.setCourse("Android1");
	certi.setDuration("2 months1");
	
	
	student.setCerti(certi);
	
	Student student1=new Student();
	student1.setId(1001);
	student1.setName("pqr1");
	student1.setCity("hyd2");
	
	//create certificate object
	
	Certificate certi1= new Certificate();
	certi1.setCourse("Hibernate2");
	certi1.setDuration("7 months");
	
	student.setCerti(certi1);
	System.out.println(student);
	System.out.println(student1);
	
	
	
	Session session=factory.openSession();
	
	session.beginTransaction();
	
	session.save(student);
	session.save(student1);
	
	session.getTransaction().commit();
	session.close();

	}

}
