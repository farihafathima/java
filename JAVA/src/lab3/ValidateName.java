package lab3;

import java.util.Scanner;
class ValidateNameException extends Exception{
	Person name;

	public ValidateNameException(Person name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "ValidateNameException [firstname=" + name.firstName +"lastName"+name.lastName+ "]";
	}
	
}
class Person{

	 String firstName;
	 String lastName;
	 char gender;
	 
	 
	public Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;}
	void getDetails() throws ValidateNameException {
	
	System.out.println("FirstName="+firstName+"LastName= "+lastName);}
}


public class ValidateName {

	public static void main(String[] args) throws ValidateNameException {
		Scanner scan=new Scanner(System.in);
		System.out.println("firstname lastname gender");
		String firstName=scan.next();
		String lastName=scan.next();
		char gen=scan.next().charAt(0);
		Person p=new Person("","",gen);
		if(p.firstName=="" && p.lastName=="") {
			throw new ValidateNameException(p);
		}
		else {
			p.getDetails();

	}

}}
