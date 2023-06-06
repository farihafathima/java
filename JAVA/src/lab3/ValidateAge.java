package lab3;
import java.util.*;
class PersonAge {
	String name;
	float age;
	PersonAge(String name, float age) {
		this.name = name;
		this.age = age;
	}
	void getDetails() throws ValidateAgeException {
		System.out.println("Name= "+name+"\nAge= "+age);
	}

}
class ValidateAgeException extends Exception{
	PersonAge p;

	public ValidateAgeException(PersonAge p) {
		super();
		this.p = p;
	}

	@Override
	public String toString() {
		return "ValidateAgeException [p=" + p.age + "]";
	}
	
}
public class ValidateAge{
	public static void main(String[] args) throws ValidateAgeException {
		Scanner scan =new Scanner(System.in);
		String name=scan.next();
		int age=scan.nextInt();
		PersonAge p=new PersonAge(name, age);
		if(age<15) {
			throw new ValidateAgeException(p);
		}
		else {
			p.getDetails();
		}
		
	}
	
}
