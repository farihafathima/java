package cgg.lambdaexceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExceptionHandlingExample {

	public static void main(String[] args) {
		//List<Integer> intList = Arrays.asList(3,9,7,16,10,20);
		List<Integer> intList = Arrays.asList(3,9,7,0,10,20);
		
		
		
//		intList.forEach(i->{
//			try {
//				System.out.println(50/i);
//			} catch (ArithmeticException e) {
//				
//				System.out.println("Arithmetic Exception Occured:"+e.getMessage());
//			}
//		});
		
		intList.forEach(lambdaWrapper(i->System.out.println(50/i),Exception.class));

	}

	
	private static <T,E extends Exception> Consumer<T> lambdaWrapper(Consumer<T> consumer,Class<E> c){
		return i->{
			try {
				consumer.accept(i);
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception Occured:"+e.getMessage());
			}
		};
	}
}
