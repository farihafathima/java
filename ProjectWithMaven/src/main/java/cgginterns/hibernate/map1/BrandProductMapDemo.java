package cgginterns.hibernate.map1;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BrandProductMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Brand brand=new Brand();
		brand.setBrandId(1);
		brand.setBrandname("TATA");
		
		
		Product p1=new Product();
		p1.setProdId(1);
		p1.setProdName("tata car");
		p1.setBrand(brand);
		
		Product p2 = new Product();
		p2.setProdId(2);
		p2.setProdName("tata salt");
		p2.setBrand(brand);
		
		Product p3 = new Product();
		p3.setProdId(3);
		p3.setProdName("tata clothes");
		p3.setBrand(brand);
		
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		brand.setProducts(products);
		
		Session session=factory.openSession();
//		Transaction tx=session.beginTransaction();
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		
//		session.save(brand);
//		
//		tx.commit();
		////fetching
		
	Brand b=(Brand)session.get(Brand.class, 1);
	System.out.println(b.getBrandname());
//	System.out.println(b.getBrandname());
//	
//	for(Product pro:b.getProducts()) {
//		System.out.println(pro.getProdName());
//	}
//		
		
		session.close();
		factory.close();
		
	}

}
