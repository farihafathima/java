package cgg.hibernate.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			
			Session session=factory.openSession();
			
			//HQL
			//Syntax
			
//			String query="from Student s where s.city= :x and s.name=:n";
//			Query q = session.createQuery(query);
//			q.setParameter("x", "warangal");
//			q.setParameter("n","fariha");
//			
//			//single result-(unique)
//			//multiple result-(list)
//			
//			List<Student> list = q.list();
//			
//			for(Student s:list) {
//				System.out.println(s.getName()+":"+s.getCity()+":"+s.getCerti().getCourse());
//			}
//			
//			
//			
//			System.out.println("------------------------------------------------------------------------");
//			Transaction tx=session.beginTransaction();
			//delete query
			
//			
//			Query q1=session.createQuery("delete from Student as s where s.city=:x");
//			
//			q1.setParameter("x", "warangal");
//			int r=q1.executeUpdate();
//			System.out.println("deleted: ");
//			System.out.println(r);			
			
			
			//update query
			
			
//			Query q2 = session.createQuery("update Student set city=:x where name=:n");
//			
//			q2.setParameter("x", "sec");
//			q2.setParameter("n", "anas");
//			int r=q2.executeUpdate();
//			System.out.println(r+" objects updates");
//			tx.commit();
			
			//how to execute join query
			
			Query q=
					session.createQuery("select b.brandId,b.brandname,p.prodName from Brand as b INNER JOIN  b.products as p");
			
			List<Object[]> list= q.getResultList();
			for(Object[] arr:list) {
				System.out.println(Arrays.toString(arr));
			}
			
			session.close();
			factory.close();
			
	}

}
