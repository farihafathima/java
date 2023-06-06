package cgginterns.hibernate.onetooneprac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonPhoneMap {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		//create object for Person
		
		Person p = new Person();
		p.setId(1);
		p.setName("Fariha");
		
		
		//creating object for phone
		Phone ph = new Phone();
		ph.setPhoneid(11);
		ph.setPhonename("Nokia 4.2");
		p.setPhone(ph);
		
		
		
		Person p1 = new Person();
		p1.setId(2);
		p1.setName("Farisa");
		
		Phone ph1 = new Phone();
		ph1.setPhoneid(12);
		ph1.setPhonename("Micromax");
		p1.setPhone(ph1);
		
		Session session =factory.openSession();
		
		Transaction tx=session.beginTransaction();
		session.save(p);
		session.save(ph);
		session.save(p1);
		session.save(ph1);
		tx.commit();
		
		session.close();
		factory.close();
		
		
		
		
	

	}

}
