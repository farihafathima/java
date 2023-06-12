package com.cgg;

import java.io.FileOutputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		
	//	Student s=(Student)session.load(Student.class, 3);
		Address addr=(Address)session.get(Address.class,2);
	//	System.out.println(addr);
	//	System.out.println(s);	
		//fetching image logic here
		
		byte[] image=addr.getImage();
		try{
			FileOutputStream fos=new FileOutputStream("src/main/java/fetchimage.jpeg");
			fos.write(image);
			fos.flush();
			fos.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
		session.close();
		factory.close();
	}

}
