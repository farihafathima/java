package cgg.hibernate.xmlmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DepartmentEmployeeMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();

	}

}
