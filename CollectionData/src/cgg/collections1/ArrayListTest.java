package cgg.collections1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list=new ArrayList<>();


		list.add("hii");
		String str="hello";
		list.add(str);
		list.add(str+str);
		list.add(str);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));


			System.out.println(list);
			System.out.println("Size"+list.size());
			System.out.println(list.contains(42));
			System.out.println(list.contains("hellohello"));
			list.remove(str);
			System.out.println(list);
			System.out.println(list.size());
			//check for empty
			System.out.println(list.isEmpty());
			
			//setting value...
			
			list.set(1, "welcome");
			System.out.println(list);
			list.add(2,"aaaaa");
			//System.out.println(list);
			
			//remove all elements
			
			//list.clear();
			//System.out.println(list);
			
			
		//vector...
			
			List <String> vector=new Vector();
			vector.addAll(list);
			System.out.println("Vector: "+list);
			
		//sets
			Set<Double> hashset=new HashSet();
			hashset.add(14.5);
			hashset.add(34.56);
			hashset.add(new Double(23.7));
			hashset.add(456.9);
			hashset.add(14.5);
			System.out.println(hashset);
			System.out.println("-------------------------------");
			
	//Treeset
			
		Set<Double> ts=new TreeSet();
		ts.addAll(hashset);
		System.out.println(ts);
		System.out.println("--------------------");
	//LinkedHashSet
		
	Set<Double> lhs=new LinkedHashSet();
	lhs.add(56.6);
	lhs.add(12.4);
	lhs.add(2.25);
	lhs.add(5.6);
	System.out.println(lhs);
	System.out.println("------------------------");
			
			
			//type unsafe collections.....
			
//			LinkedList ll=new LinkedList();
//			ll.add("abc");
//			ll.add(24.56);
//			ll.add(12);
//			ll.add(true);
//			
//			System.out.println(ll);
			
			


	}

}
