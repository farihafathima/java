package cgg.infinitestream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class InfiniteStreamExample {

	public static void main(String[] args) {
		Stream<Integer> iterate = Stream.iterate(0, i->i+2);
		List<Integer> list=iterate.limit(10).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------");
		
		Stream<String> st=Stream.<String>empty();
		
		
		System.out.println("------------------------------------------------------------------");
		
		List<String> asList = Arrays.asList("a","b","c");
		Stream<String> stream = asList.stream();
		
		
		System.out.println("--------------------------------------------------------------------");
		
		 String[] arr= {"a","b","c","d"};
		 Stream<String> stream2 = Arrays.stream(arr);
		 
		 Stream<String> stream3 = Arrays.stream(arr, 1, 3);
		 stream3.forEach(System.out::println);
		 
		System.out.println("----------------------------------------------------------------------");
		
		Stream<String> build = Stream.<String>builder().add("aa").add("bb").add("cc").build();
		
		build.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------");
		
		Stream<String> generate = Stream.generate(()->"hello").limit(10);
		
		generate.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------");
		
		IntStream range=IntStream.range(1, 6);
		range.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");
		
		LongStream range1=LongStream.range(1, 6);
		range1.forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------------");
		Random r=new Random();
		DoubleStream doubles=r.doubles(5);
		doubles.forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------------");
		
		IntStream chars="abcf".chars();
		chars.forEach(System.out::println);
		
		sys
		
		
		
		
		 
		 
		
		

	}

}
