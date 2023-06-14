package cgg.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("Fariha","Fathima",22),
				new Person("Farisa","Fathima",18),
				new Person("neha","Fathima",15),
				new Person("Anas","Ali",13)
				);
		
	System.out.println("Iterarting using loop");
	for(int i=0;i<people.size();i++) {
		System.out.println(people.get(i));
	}
	
	System.out.println("----------------------------------------------------------");
	
	System.out.println("Iterating using for in loop");
	for(Person p:people) {
		System.out.println(p);
	}
	
	//Internal Iterators -controlled by JVM possible can execute in parallel also-fast
System.out.println("----------------------------------------------------------");
	
	System.out.println("Iterating using Lambda");
	
	people.forEach(p->System.out.println(p));
	
System.out.println("----------------------------------------------------------");
	
	System.out.println("Iterating using Method reference");
	
	people.forEach(System.out::println);
	}

}
