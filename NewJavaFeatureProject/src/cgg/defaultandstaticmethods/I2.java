package cgg.defaultandstaticmethods;

public interface I2 {
	public default void greetings(String name) {
		System.out.println("Hello ...."+name);
	}

}
