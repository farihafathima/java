package cgg.doa;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cgg.entities.Products;
import hepler.SessionFacrtory;

public class ProductDoa {
public static void addProducts(String productName, String productDescription, int productPrice, int productDiscount,
		int productQuantity, String productPic, String productCategory) {
		
		Products products = new Products(productName,productDescription,productPrice,productDiscount,
				productQuantity,productPic,productCategory);
		Session session = SessionFacrtory.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(products);
		tx.commit();
		session.close();
		//SessionFacrtory.shutdown();
		System.out.println("1 row inserted");
	}
}
