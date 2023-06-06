package com.cg.eis.service;
import com.cg.eis.pl.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


interface EmployeeService{
		Employee getDetails() throws ValidateSalaryException;
		String schemes(String designation,double salary);
		void employeeDetail(Employee emp);
		
	}
public class ServiceProvider implements EmployeeService{
	@Override
		public String schemes(String designation, double salary) {
			String scheme;
			
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
			scheme="SchemeB";
			}
			return(scheme);
		}
		
		@Override
		public void employeeDetail(Employee emp){
				System.out.println("Name="+emp.name+"\nid="+emp.id+"\nDesignation="+emp.designation+"\nSalary="+emp.salary+"\nInsuranceScheme="+emp.insuranceScheme);
		}
		@Override
		public Employee getDetails() throws ValidateSalaryException {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("id-name,designation,Salary");
			int id=scan.nextInt();
			String name=scan.next();
			String designation=scan.next();
			double salary=scan.nextDouble();
			if(salary<3000) {
				throw new ValidateSalaryException();
			}
			String insuranceScheme=schemes(designation,salary);
			Employee e=new Employee(id,name,designation,salary,insuranceScheme);
			return(e);
		}	

		
		public void writeObjectToObject(Employee emp) throws IOException,FileNotFoundException {
			File obj=new File("object.txt");
			try {
				if(obj.createNewFile()) {
					System.out.println("Created");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
	            	FileOutputStream fileOut = new FileOutputStream("object.txt");
	 	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
					objectOut.writeObject(emp);
					 objectOut.close();
					 System.out.println("The Object  was succesfully written to a file");
		}
	
	}


	
