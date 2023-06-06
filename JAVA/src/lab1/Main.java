package lab1;
import java.lang.String;
import java.util.*;
class Person{

		 String firstName;
		 String lastName;
		 char gender;
		 
		 
		public Person(String firstName, String lastName, char gender) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
		}
		void setFirstName(String firstName) {
			this.firstName=firstName;
		}
		void setLastName(String lastName) {
			this.lastName=lastName;
		}
		void setGender(char gender) {
			this.gender=gender;
		}
		String getFirstName() {
			return(firstName);
		}
		String getLastName() {
			return(lastName);
		}
		char getGender() {
			return(gender);
		}}
public class Main{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Name:");
		String firstName=scan.next();
		System.out.println("LastName:");
		String lastName=scan.next();
		System.out.println("Age:");
		char gender=scan.next().charAt(0);
		Person p=new Person(firstName,lastName,gender);
		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setGender(gender);
		System.out.println("FirstName:"+p.getFirstName()+"\nLastName:"+p.getLastName()+"\nGender:"+p.getGender());
		
		
		
		
		
		
		
		
	}
}
