package cgg.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExample {

	public static void main(String[] args) {
		
		lambdaWithZeroParam();
		System.out.println("----------------------------------------------------------");
		lambdaWithClassZeroParam();
		System.out.println("----------------------------------------------------------");
		lambdaWithOneParam();
		System.out.println("----------------------------------------------------------");
		lambdaWithMultiParam();
		System.out.println("----------------------------------------------------------");
		lambdaWithParamsAndReturnType();
		System.out.println("----------------------------------------------------------");
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("fariha","fariha@gmail.com",500000));
		list.add(new Employee("farisa","farisa@gmail.com",450000));
		list.add(new Employee("neha","neha@gmail.com",300000));
		list.add(new Employee("anas","anas@gmail.com",350000));
		System.out.println("List before sorting");
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("---------------------------------------------------------------");
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo((o2.getName()));
			}
			
		});
		Collections.sort(list,(a,b)->(int) (a.getSalary()-(b.getSalary())));
		System.out.println("List after sorting");
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("---------------------------------------------------------------");
		Collections.sort(list,(a,b)->a.getName().compareTo(b.getName()) );
		System.out.println("List after sorting");
		for(Employee e:list) {
			System.out.println(e);
		}
		

	}

	private static void lambdaLengthOfStringReturnType() {
		LengthOfString l=name->name.length();
		
		System.out.println(l.lengthOfString("hello world"));
		
		
	}

	private static void lambdaAddingTwoNumbersReturnType() {
		AddingTwoNumbers add1=(a,b)->a+b;
		System.out.println(add1.addition(3,5));
		
		
		
	}

	private static void lambdaWithParamsAndReturnType() {
		MyInterface4 i4=(a1,b1)->a1>b1;
		System.out.println(i4.test(12, 10));
		
		
	}
	private static void lambdaWithMultiParam() {
	MyInterface3 i3=(a,b)->{
		System.out.println("your name :"+a);
		System.out.println("your age :"+b);
		
	};
	i3.method3("fariha", 23);
		
	}

	private static void lambdaWithOneParam() {
		MyInterface2 i2=name->System.out.println("hello"+name);
		
		i2.method2("Fariha");
		
	}

	private static void lambdaWithClassZeroParam() {
		MyInterface1 myInterface = new MyInterface1() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class...");
				
			}
			
		};
		myInterface.method1();
		
	}

	private static void lambdaWithZeroParam() {
		//defining lambda or implementing Interface
		
		MyInterface1 i1=()->System.out.println("Lambda with Zero parameters......");
		
		i1.method1();
	}

}
