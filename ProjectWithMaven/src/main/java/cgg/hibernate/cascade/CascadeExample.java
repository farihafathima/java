package cgg.hibernate.cascade;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cgginterns.hibernate.map1.Brand;
import cgginterns.hibernate.map1.Product;

public class CascadeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Brand b1 = new Brand();
		b1.setBrandId(1);
		b1.setBrandname("Apple");
		
		Product p1 = new Product(22,"iPhone");
		p1.setBrand(b1);
		Product p2 = new Product(24,"ipad");
		p2.setBrand(b1);
		Product p3 = new Product(26,"mac book");
		p3.setBrand(b1);
		Product p4 = new Product(28,"desktop");
		p4.setBrand(b1);
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		b1.setProducts(list);
		
		Transaction tx = session.beginTransaction();
		session.save(b1);
		session.delete(b1);
		tx.commit();
		
		
		
		session.close();
		factory.close();

	}

}
