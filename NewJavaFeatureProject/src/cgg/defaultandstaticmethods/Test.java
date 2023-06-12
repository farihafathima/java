package cgg.defaultandstaticmethods;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface myInterface=new MyClass();
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(20,"XYZ"));
		list.add(new Student(22,"XYZ"));
		list.add(new Student(24,"XYZ"));
		list.add(new Student(25,"XYZ"));
		
		
		ArrayList<Student> students = myInterface.sortStudents(list);
		for(Student stu:students) {
			System.out.println(stu.getName()+"\t"+stu.getAge());
		}
		System.out.println("-----------------------------------------------------------------");
		MyInterface.greet("fariha");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		int maxNum=myInterface.getMaxNum(list1);
		System.out.println(maxNum);
	}

}
