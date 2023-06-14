package cgg.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SampleExample {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("Fariha","Fathima",22),
				new Person("Farisa","Fathima",18),
				new Person("neha","Fathima",15),
				new Person("Anas","Ali",13),
				new Person("Nandini","Reddy",22)
				);
		
		//step1 sort list by lastname
		Collections.sort(people,(a,b)->a.getLastName().compareTo(b.getLastName()));
		//step2 create a method that prints all the elements in the list
		
		System.out.println("printing all persons");
		//printAll(people);
		printConditionally(people,p->true,System.out::println);
		
		//step3 create a method that prints all persons with last name beginning with s
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Printing all person with lastname begining with S");
		printConditionally(people,p->p.getLastName().startsWith("F"),System.out::println);
		System.out.println("---------------------------------------------------------");
		System.out.println("Printing all persons with First Name Beginh with N");
		printConditionally(people,p->p.getFirstName().startsWith("N"),System.out::println);

	}
	private static void printAll(List<Person> list) {
		for (Person person : list) {
			System.out.println(person);
		}
	}
	private static void printConditionally(List<Person> person,Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person person2 :person) {
			if(predicate.test(person2)) {
				consumer.accept(person2);
			}
			
		}
		
	}

}
