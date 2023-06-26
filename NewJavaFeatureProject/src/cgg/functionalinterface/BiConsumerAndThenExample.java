package cgg.functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerAndThenExample {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> adder=(I1,I2)-> System.out.println(I1+I2);
		BiConsumer<Integer,Integer> multiplier=(I1,I2)-> System.out.println(I1*I2);
		
		adder.andThen(((Object) multiplier).apply());
		

	}

}
