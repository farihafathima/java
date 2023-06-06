package exception;
import java.util.*;

public class AgeExceptionDemo {
	int age;

	public AgeExceptionDemo(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return this.age+"is invalid";
	}
	

}
class Emp{
	int age;
	String name;
	Scanner scan=new Scanner(System.in);
	System.oout.println("enter the name");
	name=scan.next();
	System.oout.println("enter the age");
	age=scan.nextInt();
	if(age<16) {
		throw new AgeException();
	}
	
}
public class AgeException{
	public static void main(String args[]) {
		try {
			Emp emp=new Emp()
			
		}
	}
}

