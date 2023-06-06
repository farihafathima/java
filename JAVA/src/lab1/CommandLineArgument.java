package lab1;

public class CommandLineArgument {
	public static void main(String args[]) {
		if((Integer.parseInt(args[0]))>0) {
			System.out.println("positive");
		}
		else {
			System.out.println("Negative");
		}
	}

}
