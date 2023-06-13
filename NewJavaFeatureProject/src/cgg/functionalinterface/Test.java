package cgg.functionalinterface;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
	//	createThreadUsingAnonymousClass();
		//createThreadUsingLambda();
		//createMethodReference(MyInterface i);
		
		//createCustomLmabda();
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("Amaravathi");
		list.add("Mumbai");
		list.add("Chennai");
		list.forEach(System.out::println);
		

	}
	private static void createCustomLmabda() {
		MyInterface m=name->System.out.println("welcome "+name);
	
		m.method("fariha");
	}

	private static void createThreadUsingLambda() {
		// TODO Auto-generated method stub
		Runnable r=()->System.out.println("My Runnable......");
		
		Thread t=new Thread(r);
		t.start();
		
	}

	private static void createThreadUsingAnonymousClass() {
		//Anonymous class
		Runnable r=new Runnable() {

			@Override
			public void run() {
				System.out.println("I am thread my task is executing......");
				
			}

	};
	
	Thread thread=new Thread(r);
	thread.start();
	}
}