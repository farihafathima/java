package com.cg.eis.bean;

import java.io.Serializable;

import com.cg.eis.exception.ValidateSalaryException;

public class Employee implements Serializable {
	
	public int id;
	public String name;
	public String designation;
	public double salary;
	public String insuranceScheme;
	
	public Employee(int id, String name, String designation, double salary,String insuranceScheme) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.insuranceScheme=insuranceScheme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws ValidateSalaryException{
		this.salary = salary;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	

}
