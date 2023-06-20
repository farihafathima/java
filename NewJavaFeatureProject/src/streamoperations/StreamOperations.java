package streamoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import cgg.streamapi.Student;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String> list = new ArrayList<String>();
	
	list.add("aafa");
	list.add("efgh");
	list.add("jhkol");
	list.add("pkjuhg");
	list.add("poiuyt");
	list.add("asdg");
	list.add("asdg");
	
//	Stream<String> stream = list.stream();//intermediate operation
//	Stream<String> distinct = stream.distinct();//intermediate operation
//	long count = distinct.count();
//	System.out.println(count);
	
	long count = list.stream().distinct().count();
	System.out.println(count);
	
	//streams cannot be reused
	
	boolean anyMatch = list.stream().anyMatch(e->e.contains("af"));
	System.out.println(anyMatch);
	
	//filter
	
	List<Student> list2=new ArrayList<Student>();
	list2.add(new Student("fariha",22));
	 list2.add(new Student("farisa",23));
	 list2.add(new Student("neha",15));
	 list2.add(new Student("Anas",78));
	
	Stream<Student> filter=list2.stream().filter(s->s.getAge()>25);
	
	filter.forEach(System.out::println);
	
	
	
	System.out.println("-------------------------------------------------------");
	//matching
	
	Boolean allMatch=list2.stream().allMatch(s->s.getName().contains("k"));
	System.out.println(allMatch);
	
	System.out.println("-------------------------------------------------------");
	
	boolean b=list2.stream().anyMatch(s->s.getAge()>15);
	System.out.println(b);
	
	
	System.out.println("-------------------------------------------------------");
	
	boolean b2=list2.stream().noneMatch(s->s.getAge()>15);
	System.out.println(b2);
	

	}

}
