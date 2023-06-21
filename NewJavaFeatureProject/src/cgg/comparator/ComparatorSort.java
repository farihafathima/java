package cgg.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Davis", 29));
		empList.add(new Employee("Alice", 26));
		empList.add(new Employee("Alice", 29));
		empList.add(new Employee("fariha", 22));

		
		System.out.println("---------------before sorting---------------------");
		empList.forEach(System.out::println);
		
		empList.sort(Comparator.comparing(Employee::getName));
		
		System.out.println("---------------after sorting----------------");
		empList.forEach(System.out::println);
		
		Comparator<Employee> comp=Comparator.comparing(Employee::getName);
		empList.sort(comp.reversed());

		System.out.println("---------------after sorting----------------");
		empList.forEach(System.out::println);
	}

}
