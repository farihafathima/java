package cgg.collections1;

import java.util.*;

public class TraverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList();
		names.add("Fariha");
		names.add("Divya");
		names.add("Sindhu");
		names.add("Nandini");
		names.add("Ramya");
		
		for(String s:names) {
			System.out.print(s+"\t"+s.length()+"\t");
			StringBuffer sb=new StringBuffer(s);
			System.out.println(sb.reverse());
		}
		System.out.println("------------------------------");
		//traversing using iterator:Forward traversing
		Iterator<String>it=names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------------------");
		
		//traversing using listiterator:Backward Traversing
		
		ListIterator<String>itr=names.listIterator(names.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
			
		}
		System.out.println("-------------------------------");
		System.out.println("--------------------ForEach Method------------------------");
		//foreach method
		names.forEach(e->System.out.println(e));	
		
		System.out.println("Sorting of elements");
		
		TreeSet<String> ts=new TreeSet<>();
		ts.addAll(names);
		ts.forEach(e->System.out.println(e));
		
	}

}
