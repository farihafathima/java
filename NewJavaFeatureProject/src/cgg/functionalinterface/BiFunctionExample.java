package cgg.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer,Integer,String>biFunction=(n1,n2)->"Result : "+(n1+2);
		biFunction.apply(12, 14);
		System.out.println(biFunction.apply(12, 14));

	}

}
