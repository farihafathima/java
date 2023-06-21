package cgg.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComapringIntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Davis", 29));
		empList.add(new Employee("Alice", 26));
		empList.add(new Employee("Alice", 29));
		empList.add(new Employee("fariha", 22));
		empList.add(new Employee(null, 28));
		empList.add(new Employee(null, 31));
		empList.add(new Employee(null, 32));
		
		//Comparator<Employee> com = Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));
		Comparator<Employee> com = Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));
		empList.sort(com);
		empList.forEach(System.out::println);

	
	
	}

}
