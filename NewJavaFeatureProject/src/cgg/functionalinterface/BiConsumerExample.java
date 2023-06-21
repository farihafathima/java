package cgg.functionalinterface;

import java.util.HashMap;
import java.util.Map;

import cgg.streamapi.Student;


public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "b");
		map.put(3, "c");
		map.put(3, "d");
		
		
		//BiConsumer<Integer,String> biConsumer=(k,v)->System.out.println("key: "+k+"\t Value : "+v);
		map.forEach((k,v)->System.out.println("key: "+k+"\t Value : "+v));
		
		Map<Integer,Student> stuMap=new HashMap<Integer,Student>();
		
		stuMap.put(1, new Student("abc", 22));
		stuMap.put(2,new Student("bcd", 34));
		stuMap.put(3,new Student("bnjk", 94));
		stuMap.put(4,new Student("bcdy", 84));
		stuMap.forEach((k,v)->System.out.println("key: "+k+"\t Value : "+v));
		
		

	}

}
