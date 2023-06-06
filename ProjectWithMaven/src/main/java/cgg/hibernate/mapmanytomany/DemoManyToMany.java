package cgg.hibernate.mapmanytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	 
	 Employee e= new Employee();
	 e.setEmployeeId(1);
	 e.setEmployeeName("fariha");
	 
	 
	 Employee e1= new Employee();
	 e1.setEmployeeId(2);
	 e1.setEmployeeName("farisa");
	 
	 
	 Project p = new Project();
	 p.setProjectId(11);
	 p.setProjectName("development");
	 
	 
	 Project p1 = new Project();
	 p1.setProjectId(22);
	 p1.setProjectName("Chat Bot");
	 
	 List<Employee> emp=new ArrayList<>();

	 List<Project> pro=new ArrayList<>();
	 
	 emp.add(e1);
	 emp.add(e);
	 
	 pro.add(p1);
	 pro.add(p);
	 
	 
	 e.setProject(pro);
	 p.setEmployee(emp);
	 

		Session session =factory.openSession();
		
		Transaction tx=session.beginTransaction();
		session.save(e);
		session.save(e1);
		session.save(p);
		session.save(p1);
		tx.commit();
		
		Project proj=session.get(Project.class, 11);
		System.out.println(proj.getProjectName());
		for(Employee emp1: proj.getEmployee()) {
			System.out.println(emp1.getEmployeeName());
		}
		
		System.out.println("==================================================");
		

		Employee e2=session.get(Employee.class, 1);
		System.out.println(e2.getEmployeeName());
		for(Project p2: e2.getProject()) {
			System.out.println(p2.getProjectName());
		}
		
		factory.close();
		session.close();

	}

}
