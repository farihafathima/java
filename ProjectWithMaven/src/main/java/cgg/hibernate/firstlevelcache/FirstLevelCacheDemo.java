package cgg.hibernate.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cgg.Student;

public class FirstLevelCacheDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Student student = null;
		
		System.out.println(session.contains(student));
		
		 student=session.get(Student.class, 14);
		
		System.out.println(student);
		
		System.out.println("working something........");
		
		
Student student1=session.get(Student.class, 14);
		
		System.out.println(student1);
		
		System.out.println("working something.........");
		System.out.println(session.contains(student1));
		session.close();
		factory.close();
		

	}

}
