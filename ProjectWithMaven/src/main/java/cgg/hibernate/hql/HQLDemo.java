package cgg.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.cgg.Student;

public class HQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			
			Session session=factory.openSession();
			
			//HQL
			//Syntax
			
			String query="from Student s where s.city= :x and s.name=:n";
			Query q = session.createQuery(query);
			q.setParameter("x", "warangal");
			q.setParameter("n","fariha");
			
			//single result-(unique)
			//multiple result-(list)
			
			List<Student> list = q.list();
			
			for(Student s:list) {
				System.out.println(s.getName()+":"+s.getCity()+":"+s.getCerti().getCourse());
			}
			session.close();
			factory.close();
			
	}

}
