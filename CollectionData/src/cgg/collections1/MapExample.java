package cgg.collections1;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap adding Elements
		
		Map<String,Integer> courses=new HashMap<>();
		courses.put("Core JAVA", 4000);
		courses.put("Basic Python", 50000);
		courses.put("Spring FrameWork", 10000);
		courses.put("Androide",100000);
		courses.put("Androide", 70000);
		courses.put("PHP", 2000);
		System.out.println(courses);
		System.out.println("------------------------------------------------------");
		courses.forEach((k,v)->System.out.println(k+"=>"+v));
		System.out.println(courses.get("Spring FrameWork"));
		System.out.println("----------------------------------------------------------------------------------");
		
		//Traversing map using iterator
		
		Set set = courses.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+"=>"+me.getValue());
		}
		System.out.println(courses.get("Spring FrameWork"));
		
		//Updating a value
		int new_fees=(courses.get("Core JAVA"))+1000;
		courses.put("Core Java",new_fees );
		System.out.println(courses);
		

	}

}
