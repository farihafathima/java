package cgg.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatarComparing {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("Davis",29));
		empList.add(new Employee("Alice",26));
		empList.add(new Employee("Alice",29));
		empList.add(new Employee("fariha",22));
		
		List<String> asList = Arrays.asList("avbsd","gsdhJHD");
		
		
		System.out.println("before sorting.....");
		
		empList.forEach(System.out::println);
		
		System.out.println("AfterSorting...........");
		
		
		
		
		
		//Comaparator ComparingInt
		
		Comparator<String> com = Comparator.comparingInt(String::length);
		Collections.sort(asList,com);
		asList.forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("before sorting.....");
		
		empList.forEach(System.out::println);
		
		Comparator<Employee> com1 = Comparator.comparing(Employee::getName).thenComparing(Employee::getId);
		
		Collections.sort(empList,com1);
		System.out.println("----------------------After Sorting----------------------------------");
		
		empList.forEach(System.out::println);
		
		
		
		
		
		
		
		
	}

}
