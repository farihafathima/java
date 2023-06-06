package lab1;
import java.util.*;
public class PositiveString {
	String display(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1)) {
				return("Not postive");
			}
		}
		return("Positive");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.next();
		PositiveString ps=new PositiveString();
		System.out.println(ps.display(str));
		
		

	}

}
