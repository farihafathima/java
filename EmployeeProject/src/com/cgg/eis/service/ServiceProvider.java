package com.cgg.eis.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.cgg.eis.bean.Employee;
//import com.cgg.eis.exception.ValidateSalaryException;

interface EmployeeService{
		boolean addEmployee1(int id,String name,String designation,double salary);// throws ValidateSalaryException;
		boolean deleteEmployee(int id);
		void displayAll();
		String Scheme(double salary,String Designation);
		void checkScheme();
		void save();}
		
public class ServiceProvider implements EmployeeService {
	HashMap<Integer,Employee> map;
	
	
	public ServiceProvider(HashMap<Integer, Employee> map) {
		super();
		File file=new File("emp.ser");
		if(file.exists()) {
			 FileInputStream fileIn;
			try {
				fileIn = new FileInputStream(file);
				 try (ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
					this.map =(HashMap<Integer,Employee>)objectIn.readObject();
				}
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          
			
		}
		else {
			this.map=map;
		}
		
	}

	@Override
	public boolean addEmployee1(int id,String name,String designation,double salary) {
		String insuranceScheme=Scheme(salary,designation);
		Employee e=new Employee(id,name,designation,salary,insuranceScheme);
		map.put(id, e);
		return true;
	}

	@Override
	public boolean deleteEmployee(int emp_id) {
		// TODO Auto-generated method stub
		map.remove(emp_id);
		return true;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		map.forEach((k,v)->System.out.println("Name="+v.getName()+"\nid="+v.getId()+"\nDesignation="+v.getDesignation()+"\nSalary="+v.getSalary()+"\nInsuranceScheme="+v.getInsuranceScheme()+"\n---------------------------------------------------"));
		System.out.println("--------------------------------------------------------------------------------------");
	}

	@Override
	public String Scheme(double salary, String designation) {
		// TODO Auto-generated method stub
		String scheme="";
		
		if(designation=="Manager" && salary>=40000) {
			scheme="SchemeA";
		}
		else if(designation=="Programmer" && salary>=20000 &&  salary<40000) {
	
		scheme="SchemeB";
		}
		else if(designation=="System Associate" && salary>=5000 &&  salary<20000) {
		scheme="SchemeA";
		}
		else {
		scheme="Scheme";}
		return scheme;
		
	}

	@Override
	public void checkScheme() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("emp.ser");
			ObjectOutputStream os=new ObjectOutputStream(fos);
			os.writeObject(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Details Saved...... THANK YOU.........");
		
	}
}
