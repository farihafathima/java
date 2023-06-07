package cgg.hibernate.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.cgg.Student;

public class HQLPagination {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		Query q = session.createQuery("from Student");
		
		//implementing pagination using hibernate
		
		q.setFirstResult(6);//Starting index
		q.setMaxResults(5);//pageSize 
		
		List<Student> list = q.list();
		
		for(Student s:list) {
			System.out.println(s.getId()+":"+s.getName()+":"+s.getCity());
		}
		
		factory.close();
	}

}
