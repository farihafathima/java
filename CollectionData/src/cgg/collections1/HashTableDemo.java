package cgg.collections1;
import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> balance=new Hashtable<>();
		balance.put("ABC", 10000.0);
		balance.put("PQR", 70000.0);
		balance.put("STU",  40000.0);
		balance.put("LMN", 30000.0);
		System.out.println(balance);
		
		System.out.println("-------------------------------------------");
		
		//traversing using enumeration
		
		Enumeration<String> keys=balance.keys();
		while(keys.hasMoreElements()) {
			String ele=keys.nextElement();
			System.out.println(ele+"=>"+balance.get(ele));
		}
		
		
      double val=balance.get("PQR");
      double newval=val+1000;
      balance.put("PQR", newval);
      System.out.println(balance.get("PQR"));
	
		System.out.println("---------------------------------------");
		balance.forEach((k,v)->System.out.println(k+"->"+v));
		}
}
