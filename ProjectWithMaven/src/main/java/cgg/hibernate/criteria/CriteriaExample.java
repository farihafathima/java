package cgg.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cgg.Student;

import cgginterns.hibernate.map1.Brand;

public class CriteriaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria c= session.createCriteria(Brand.class);
		//c.add(Restrictions.gt("id", 10));
		
//		c.add(Restrictions.like("", "R%"));
		
		List<Brand> list=c.list();
		for(Brand s:list) {
			System.out.println(s.getBrandId()+":"+s.getBrandname()+":"+s.getProducts().get(1).getProdName());
		}
		
			
	}
}
