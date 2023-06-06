package cgg.collections1;
import  java.util.ArrayList;
import java.util.Collections;
public class ProductArrayList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<>();
		arr.add("fariha");
		arr.add("Fathima");
		arr.add("farisa");
		arr.add("Neha fathima");
		arr.add("Anas Ali");
		
		Collections.sort(arr,new DescendComparator());
		
		System.out.println(arr);
		
		
		
		

	}

}
