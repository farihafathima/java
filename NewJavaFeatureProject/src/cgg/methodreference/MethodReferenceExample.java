package cgg.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// Runnable r=()->System.out.println("My Task is to run");
		// Runnable r=MethodReferenceExample::myRun;

		// executorService.execute(r);
		List<Integer> numbers = Arrays.asList(4, 9, 36, 7, 9);
		numbers.forEach(System.out::println);

		System.out.println("--------------------------------------------------------------------------------");

		List<Double> squareRoot = MethodReferenceExample.findSquareRoots(numbers, Double::new);
		squareRoot.forEach(System.out::println);
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("fariha",22));
		persons.add(new Person("farisa",18));
		persons.add(new Person("neha",9));
		
		
		List<String> names=MethodReferenceExample.getPersonName(persons,Person::getName);
		System.out.println("------------------------------------------------------------");
		names.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------");
		
		PersonInformation pm=Person::new;
		System.out.println(pm.getPerson().getPersonInfo());
		
		
		
		
	}

	private static List<String> getPersonName(ArrayList<Person> persons, Function<Person,String> function) {
		
		List<String> result=new ArrayList<String>();
		persons.forEach(p->result.add(function.apply(p)));
		
		return result;
	}

	private static void myRun() {
		System.out.println("My Task is to run");

	}

	private static List<Double> findSquareRoots(List<Integer> list, Function<Integer, Double> f) {
		List<Double> result = new ArrayList<Double>();
		list.forEach(x->result.add(Math.sqrt(f.apply(x))));
		return result;
	}

}
