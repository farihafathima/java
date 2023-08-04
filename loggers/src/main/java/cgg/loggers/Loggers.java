package cgg.loggers;

public class Loggers {

	public static void main(String[] args) {
		Calci c = new Calci();
		System.out.println("Calling add method");
		c.add(10,10);
		System.out.println("End of add method...");
		System.out.println("Calling div method");
		c.div(10,0);
		System.out.println("End of division method");
		
		System.out.println("Calling sub method");
		c.sub(10,5);
		System.out.println("End of sun method");
	}

}
