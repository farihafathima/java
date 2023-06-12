package cgg.defaultandstaticmethods;

public interface I1 {

	
	 public default void greetings(String name) {
		System.out.println("Hello ...."+name);
	}
}
