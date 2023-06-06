package com.cgg.eis.exception;
import com.cgg.eis.bean.*;
import java.util.*;
public class ValidateSalaryException extends Exception{
	double salary;
	
	public ValidateSalaryException(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary of an Employee "+salary+" is lessthan 3000";
	}
}
