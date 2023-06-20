package cgg.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {
	
	public static void main(String[] args) {
		String [] arr= {"ABC","PQR","XYZ",};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		
		Stream<String> of = Stream.of("a","b","t");
		System.out.println("------------------------------------------");
		
		of.forEach(System.out::println);
		
		List<String> list = new ArrayList<String>();
		System.out.println("--------------------------------------------");
		list.add("hello");
		list.add("aaaaa");
		list.add("poiuytr");
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
		
		
		 List<Student> list2 = new ArrayList<Student>();
		 list2.add(new Student("fariha",22));
		 list2.add(new Student("farisa",23));
		 list2.add(new Student("neha",15));
		 list2.add(new Student("Anas",78));
		 
		 Stream<Student> parallelStream = list2.parallelStream();
		 System.out.println("Student data sent for processing........");
		 parallelStream.forEach(s->doProcess(s));
		
	}

	private static void doProcess(Student s) {
		// TODO Auto-generated method stub
		
		System.out.println(s);
		
		
		
	}
	
	//Massive amount of data for processing going for paralleLStream is a Good option
	
	//Order of iteration is not maintained
	//,akes use of multiple threads as well as multicore Processor.

}
