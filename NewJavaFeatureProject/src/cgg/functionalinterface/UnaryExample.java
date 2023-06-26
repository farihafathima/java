package cgg.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryExample {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		UnaryOperator<Integer> unaryOpt=i->i+i;
		unary(unaryOpt,list);
		

	}

	private static void unary(UnaryOperator<Integer> unaryOpt, List<Integer> list) {
		
		
	}

}
