import java.io.*;
package files;

public class Student implements Serializable{
	private int rollNo;
	private String Name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
	}
	
}
class Demo{
	public static void main(String [] args) {
		try {
			FileOutputStream writer=new FileOutputStream ("student.dat");
			ObjectOutputStream oos=new ObjectOutputStream(writer);
			
			Student s1=new Student(12,"ABC");
			System.out.println("Student Object S1:")
		}
	}
}
