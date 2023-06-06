package cgg.collections1;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Box box=new Box("water");
		
//		box.container="This is String";
//		System.out.println(box.getValue());
		
		//this is not type safe
		
		Box<String> box=new Box<>("hello");
		System.out.println(box.getValue());
		System.out.println(box.container.getClass().getName());
		
		Box<Integer> box1=new Box<>(123);
		System.out.println(box1.getValue());
		System.out.println(box1.container.getClass().getName());
		
		Box<Boolean> box2=new Box<>(true);
		System.out.println(box2.getValue());
		System.out.println(box2.container.getClass().getName());
		
		
		box.performSomeTask();
		box1.performSomeTask();
		
	}

}
