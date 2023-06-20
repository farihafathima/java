package streamoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(1,1,1);
		
		Integer reducer=integers.stream().reduce(23,(a,b)->a+b);
		System.out.println(reducer);
		
		System.out.println("-------------------------------------------------");
		
		List<String> names=new ArrayList<String>();
		names.add("fariha");
		names.add("fathima");
		names.add("Farisa");
		names.add("neha");
		
		List<String> collect=names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(collect);
	}
	

}
