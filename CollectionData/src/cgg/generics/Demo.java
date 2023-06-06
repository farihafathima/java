package cgg.generics;
import java.awt.List;
import java.util.ArrayList;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//advantage of generic type safety -errors are caughted at  compile time
		ArrayList<Integer> list=new ArrayList<>();
		//list.add("hello");
		list.add(12);
		
		List anotherList=new List();
		anotherList.add("hello");
		anotherList.add(123);
		anotherList.add(12.5);
		System.out.println(anotherList);
		System.out.println(list);

	}

}
