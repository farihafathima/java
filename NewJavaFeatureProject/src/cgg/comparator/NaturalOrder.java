package cgg.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalOrder {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Davis", 29));
		empList.add(new Employee("Alice", 26));
		empList.add(new Employee("Alice", 29));
		empList.add(new Employee("fariha", 22));
		
		System.out.println("=-------------------before sorting----------------------------");
		List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
		nameList.forEach(System.out::println);
		System.out.println("----------------------After Sorting----------------------------");
		
		nameList.sort(Comparator.reverseOrder());
		nameList.forEach(System.out::println);

		
	}

}
