package com.cgg.eis.pl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.cgg.eis.bean.Employee;
import com.cgg.eis.exception.ValidateSalaryException;
import com.cgg.eis.service.ServiceProvider;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ValidateSalaryException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer,Employee> map=new HashMap<>();
		int id;
		String name;
		String designation;
		double salary;int option;
		int emp_id;
		ServiceProvider si=new ServiceProvider(map);
		
		
		
		while(true) {
			System.out.println("press 1 to add Employee");
			System.out.println("press 2 to delete Employee");
			System.out.println("press 3 to display the Employee details");
			System.out.println("press 4 to exit the Aplication");
			System.out.println("Enter your option.........");
			
			option=Integer.parseInt(br.readLine());
			
			if(option==1) {
				//Adding of Employee
				 id=Integer.parseInt(br.readLine());
				 name=br.readLine();
				designation=br.readLine();
				salary=parseDouble(br.readLine());
				if(salary<3000) {
					throw new ValidateSalaryException(salary);
				}
				if(si.addEmployee1(id, name, designation, salary)) {
					System.out.println("Employee "+name+" details added successfully.....");
				}
			}
			else if(option==2) {
				//Deleting of an Employee
				emp_id=Integer.parseInt(br.readLine());
				if(si.deleteEmployee(emp_id)) {
					System.out.println("Employee  with id "+emp_id+" details deleted successfully.......");
				}
				else {
					System.err.println("SomeThing Went wrong........");
				}
				
			}
			else if(option==3) {
				//Displaying the details of the Employee
				si.displayAll();
				
			}
			else if(option==4) {
				//save the HashMap to the File and exit
				si.save();
				break;
			}
			else {
				System.out.println("Enter the valid option");
			}
			
			
		}

	}

	private static double parseDouble(String readLine) {
		// TODO Auto-generated method stub
		return 0;
	}

}
