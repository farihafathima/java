package cgg.defaultandstaticmethods;

import java.util.ArrayList;
import java.util.Collections;

public interface MyInterface {
	
	
	default public ArrayList<Student>sortStudents(ArrayList<Student >stuList){
		Collections.sort(stuList);
		return stuList;
	}
	static public void greet(String greeting) {
		System.out.println(" hello"+greeting);
	}
	public int getMaxNum(ArrayList<Integer> list1);
}
	
