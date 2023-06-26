package cgg.functionalinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BiOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map=new HashMap<>();
		
		map.put("abc","ABC");
		map.put("abc1","ABC1");
		map.put("abc2","ABC2");
		
		BinaryOperator<String> binaryOpt=(s1,s2)->s1+"-"+s2;
		
		binaryOperator(binaryOpt,map).forEach(System.out::println);
		
		
	}

	private static List<String> binaryOperator(BinaryOperator<String> binaryOpt, Map<String, String> map) {
		
		List<String> biList=new ArrayList<>();
		map.forEach((s1,s2)->biList.add(binaryOpt.apply(s1, s2)));
		return biList;
	}

}
