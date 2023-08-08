package cgg.doa;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cgg.entities.Category;
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


	public static List<Products> getAllProducts() {
		Session session = SessionFacrtory.getSessionFactory().openSession();
		List<Products> products=null;
		
		try {
			Query<Products> query = session.createQuery(" FROM Products", Products.class);
			products = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return products;
		
	}
	
	public static List<Products> getProductsByCategory(String categoryName) {
	    Session session = SessionFacrtory.getSessionFactory().openSession();
	    List<Products> products = null;
	    
	    try {
	        Query<Products> query = session.createQuery("FROM Products WHERE productCategory = :categoryName", Products.class);
	        query.setParameter("categoryName", categoryName);
	        products = query.getResultList();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }
	    return products;
	}

	
	
	
}
