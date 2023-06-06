package cgg.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list=new ArrayList<>();


		list.add("hii");
		String str="hello";
		list.add(str);
		list.add(str+str);


			System.out.println(list);
			System.out.println("Size"+list.size());
			System.out.println(list.contains(42));
			System.out.println(list.contains("hellohello"));
			list.remove("hello");
			System.out.println(list.size());


	}

}
