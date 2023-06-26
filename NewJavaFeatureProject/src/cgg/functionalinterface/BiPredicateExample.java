package cgg.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<Integer,String> biPredicate=(i,o)->i>20&&o.startsWith("m");
		
		System.out.println(biPredicate.test(30, "man"));
		System.out.println(biPredicate.test(31, "nan"));
		System.out.println(biPredicate.test(33, "san"));

	}

}
