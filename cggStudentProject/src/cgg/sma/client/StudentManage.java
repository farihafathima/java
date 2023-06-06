package cgg.sma.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import cgg.sma.dao.*;
import cgg.sma.model.*;
public class StudentManage {
	static StudentDAO studentdao=new StudentDAO();
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Welcome to student management Application");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press1 to Add Student");
			System.out.println("Press2 to Update Student");
			System.out.println("Press3 to Delete Student");
			System.out.println("Press4 to Display All Student");
			System.out.println("Press5 to Exit");
			
			System.out.println("Enter your choice");
			
			try {
				int ch=Integer.parseInt(br.readLine());
				if(ch==1) {
					//add student
					
					
					System.out.println("Enter student name");
					String name=br.readLine();
					System.out.println("enter student phone number");
					String phone=br.readLine();
					System.out.println("Enter student name");
					String city=br.readLine();
					
					
					//create student object 
					Student student=new Student(name,phone,city);
					System.out.println(student);
					boolean answer=false;
					try {
						answer = studentdao.insertStudentoDB(student);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(answer) {
						System.out.println("Student data add successfully");
					}
					else {
						System.out.println("Something went wrong");
					}
				}
				else if(ch==2) {
					//update student
					System.out.println("Enter id to update");
					int id=Integer.parseInt(br.readLine());
					System.out.println("Enter student name");
					String name=br.readLine();
					System.out.println("enter student phone number");
					String phone=br.readLine();
					System.out.println("Enter student city");
					String city=br.readLine();
					
					
					//create student object 
					Student student=new Student(id,name,phone,city);
					System.out.println(student);
					boolean answer=false;
					try {
						answer = studentdao.updateStudent(student);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(answer) {
						System.out.println("Student data Updated successfully");
					}
					else {
						System.out.println("Something went wrong");
					}
				}
				else if(ch==3) {
					//delete Student
					System.out.println("Enter student id to delete");
					int userId=Integer.parseInt(br.readLine());
					boolean answer =studentdao.deleteStudent(userId);
					if(answer) {
						System.out.println("Student data deleted successfully");
					}
					else {
						System.out.println("Something went wrong");
					}
				}
				else if(ch==4) {
					//display all Students
					studentdao.showAll();
				}
				else if(ch==5) {
					//exit
					break;
				}
			}catch(IOException e) {
				System.out.println(e);
			}
			
		}
		System.out.println("Thank you for using this app");
		System.out.println("see you......bye");
	}

}
