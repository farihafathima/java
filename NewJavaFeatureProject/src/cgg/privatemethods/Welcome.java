package cgg.privatemethods;

public interface Welcome {

	void hi();
	default void greet() {
		System.out.println("inside default grret method...");
		welcome();
		welcome2();
	}
	public static void test() {
		System.out.println("test");
		welcome();
	}
	
	private static void welcome() {
		System.out.println("Welcome to java 9");
	}
	private void welcome2() {
		System.out.println("Welcome again to java 9");
	}
	
	
}
