package cgg.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapForEachExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Object, Object> hashMap = new ConcurrentHashMap<>();
		for(int i=0;i<=100;i++) {
			hashMap.put(i, "person"+i);
		}
		
		hashMap.forEach((k,v)->{
			System.out.println("Thread"+Thread.currentThread().getName());
			System.out.println(k+"\t"+v);
			
		});
		
		hashMap.forEach(3,(key,val)->{
			System.out.println("Thread:"+Thread.currentThread().getName());
			
			System.out.println(key+"\t"+val);
		});
		

	}

}
