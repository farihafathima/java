package cgg.hibernate.xmlmapping;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class XMLMappingeExample {

	public static void main(String[] args) {

SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		//Person1 person = new Person1(110,"ABC","Hyd","1234567890");
		Department d = new Department();
		//d.setId(1);
		d.setName("cse");
		
		
		
		Employee1 e1 = new Employee1();
		//e1.setEmployeeId(11);
		e1.setEmployeeName("Abc");
		e1.setEmployeeSalary(10000000);
		e1.setDept(d);
		
		Employee1 e2 = new Employee1();
	//	e2.setEmployeeId(12);
		e2.setEmployeeName("efg");
		e2.setEmployeeSalary(10000000);
		e2.setDept(d);
		
		Employee1 e3 = new Employee1();
		//e3.setEmployeeId(13);
		e3.setEmployeeName("hij");
		e3.setEmployeeSalary(10000000);
		e3.setDept(d);
		
		Employee1 e4 = new Employee1();
		//e4.setEmployeeId(15);
		e4.setEmployeeName("klm");
		e4.setEmployeeSalary(10000000);
		e4.setDept(d);
		
		ArrayList<Employee1> al =new ArrayList<Employee1>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		d.setEmployee(al);
		
		Transaction tx=session.beginTransaction();
		session.save(d);
		tx.commit();
		session.close();
		factory.close();

	}

}
