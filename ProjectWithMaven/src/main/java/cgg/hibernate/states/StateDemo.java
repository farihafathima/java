package cgg.hibernate.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cgg.Certificate;
import com.cgg.Student;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//CREATING STUDENT OBJECT
		
		
		Session s=factory.openSession();
	//	Transaction tx=s.beginTransaction();
		
		Student stu=s.get(Student.class,11 );
		
		
		//detached state
		
		//s.evict(stu);
		
		
		//stu.setName("hjkil");
		
		//s.update(stu);
		
		//removed state
		
//	s.delete(stu);
		//s.update(stu);
		
		
		//tx.commit();
		s.close();
		stu.setName("aaa");
		s=factory.openSession();
		Transaction t=s.beginTransaction();
		s.update(stu);
		s.close();
		factory.close();
		
		

	}

}
