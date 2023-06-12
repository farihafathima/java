package cgg.defaultandstaticmethods;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass implements MyInterface  {

	public int getMaxNum(ArrayList<Integer> list1) {
		int num=Collections.max(list1);
		return num;

	}
//	@Override
//	public ArrayList<Student> sortStudents(ArrayList<Student> stu){
//		
//		
//		return n;
		
	//}
	static public void greet(String greeting) {
		System.out.println(" hello"+greeting);
	}
	
}
