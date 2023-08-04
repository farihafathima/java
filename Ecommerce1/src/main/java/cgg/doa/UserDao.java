package cgg.doa;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cgg.entities.Users;
import hepler.SessionFacrtory;

public class UserDao {
	public static void addUser(String userName,String userEmail,String userPassword,String userph,String useraddress,String userType) {
		
		Users user1 = new Users(userName,userEmail,userPassword,userph,useraddress,userType);
		Session session = SessionFacrtory.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(user1);
		tx.commit();
		session.close();
		//SessionFacrtory.shutdown();
		System.out.println("1 row inserted");
	}
	public static Boolean userExist(String username,String password) {
		 Session session = SessionFacrtory.getSessionFactory().openSession();
	        boolean userExists = false;
	        try {
	            String hql = "FROM Users WHERE userName = :username AND userPassword = :password";
	            Query<Users> query = session.createQuery(hql, Users.class);
	            query.setParameter("username", username);
	            query.setParameter("password", password);
	            List<Users> userList = query.list();
	            userExists = !userList.isEmpty();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return userExists;
	    }
	
	 public static String getUserType(String username, String password) {
	        Session session = SessionFacrtory.getSessionFactory().openSession();
	        String userType = null;
	        try {
	            String hql = "SELECT userType FROM Users WHERE userName = :username AND userPassword = :password";
	            Query<String> query = session.createQuery(hql, String.class);
	            query.setParameter("username", username);
	            query.setParameter("password", password);
	            List<String> userTypeList = query.list();
	            if (!userTypeList.isEmpty()) {
	                userType = userTypeList.get(0); // Assuming there's only one match (unique username and password)
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return userType;
	    }
	 public static List<Users> getAllDetails() {
		    Session session = SessionFacrtory.getSessionFactory().openSession();
		    List<Users> usersList = null;
		    try {
		        String hql = "FROM Users WHERE userType = :userType";
		        Query<Users> query = session.createQuery(hql, Users.class);
		        query.setParameter("userType", "normal");
		        usersList = query.list();
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        session.close();
		    }
		    return usersList;
		}
	}
		
	
		
		
		
		
		
		
		

	


