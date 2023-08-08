package cgg.doa;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cgg.entities.Category;
import hepler.SessionFacrtory;

public class CategoryDoa {

public static void addCategory(String categoryName,String categoryDescription) {
		
		Category category = new Category(categoryName,categoryDescription);
		Session session = SessionFacrtory.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(category);
		tx.commit();
		session.close();
		//SessionFacrtory.shutdown();
		System.out.println("1 row inserted");
	}

	public static List<String> getAllCategoryNames() {
		List<String> categoryNames = null;
		Session session = SessionFacrtory.getSessionFactory().openSession();
		try {
			Query<String> query = session.createQuery("SELECT categoryName FROM Category", String.class);
			categoryNames = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return categoryNames;
	}
	
	public static List<Category> getCategory(){
		List<Category> category=null;
		Session session = SessionFacrtory.getSessionFactory().openSession();
		try {
			Query<Category> query = session.createQuery(" FROM Category", Category.class);
			category = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return category;
		
	}

}

