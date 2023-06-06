package lab1;
import java.util.*;
import java.lang.String;
public class Details {
	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.println("name:");
		String firstName=scan1.next();
		System.out.println("Lastname:");
		String lastName=scan1.next();
		System.out.println("Gender:");
		char Gender=scan1.next().charAt(0);
		System.out.println("age:");
		int age=scan1.nextInt();
		System.out.println("weight:");
		float weight=scan1.nextFloat();
		System.out.println("FirstName:"+firstName+"\nLastName:"+lastName+"\nGender:"+Gender+"\nAge:"+age+"\nWeight:"+weight);
		

	}

}
