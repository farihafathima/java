package cgg.collections1;
import java.util.ArrayList;
import java.util.Collections;

class SortingExample {

	public static void main(String[] args) {
		ArrayList <Emp> emps=new ArrayList<>();
		emps.add(new Emp("pqr","543217",15));
		emps.add(new Emp("abr","5433417",10));
		emps.add(new Emp("efr","5438917",3));
		System.out.println(emps);
		
		Collections.sort(emps,new IdComparator());
		
		System.out.println(emps);
		ArrayList<Emp> emps1=new ArrayList<>(emps);
		Collections.sort(emps1,new NameComaparator());
		System.out.println(emps1);
	}

}
