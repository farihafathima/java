package hepler;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFacrtory {

	    private static final SessionFactory sessionFactory;

	    static {
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	            // Handle the exception appropriately, e.g., log it
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

	    public static void shutdown() {
	        // Close caches and connection pools
	        getSessionFactory().close();
	    }
	}
