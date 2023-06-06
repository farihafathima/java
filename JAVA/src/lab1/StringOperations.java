package lab1;
import java.util.*;
public class StringOperations {

	
 		String addString(String str) {
			return(str+" "+str);
		}
 		String replaceOdd(String str) {
 			String new_str="";
 			for(int i=0;i<str.length();i++) {
 				if(i%2==0) {
 					new_str=new_str+str.charAt(i);
 				}
 				else {
 					new_str=new_str+"#";
 				}	
 			}
 			return(new_str);
 		}
 		String removeDublicate(String str) {
 			String new_str="";
 			int flag=0;
 			for(int i=0;i<str.length();i++) {
 				flag=1;
 				for(int j=0;j<i;j++) {
 					if(str.charAt(i)==str.charAt(j)) {
 						flag=0;
 						break;
 					}
 				}
 				if(flag==1) {
 					new_str=new_str+str.charAt(i);
 				}
 				
 			}
 			System.out.println(new_str);
			return new_str;
 			
 		}
 		String oddUpper(String str) {
 			String new_str="";
 			for(int i=0;i<str.length();i++) {
 				if(i%2==0) {
 					new_str=new_str+str.charAt(i);
 				}
 				else {
 					new_str=new_str+(Character.toUpperCase(str.charAt(i)));
 				}
 			}
			return new_str;
 			
 		}
 	 void display(int option,String str) {
 		
 		switch(option) {
 		case 1:
 			System.out.println("Addition of String= "+addString(str));
 			break;
 		case 2:
 			System.out.println("Replaceing with #="+replaceOdd(str));
 			break;
 		case 3:
 			System.out.println("Removing Dublicate= "+removeDublicate(str));
 			break;
 		case 4:
 			System.out.println("upper = "+oddUpper(str));
 			break;
 		default:
 			System.out.println("enter the proper number");
 		}}
 		public static void main(String[] args) {
 			//farihaSystem.out.println("1.Add the String to itself\n2.Replace odd positions with #\n3.Remove duplicate characters in the String\n4.Change odd characters to upper case\nEnter the number For Specific operation");
 			Scanner scan=new Scanner(System.in);
 			System.out.println("Enter the String");
 			String str=scan.next();
 			System.out.println("enter the number 1.Add the String TO itself\n2.RePlace Odd position with #\n3.Remove Dublicate Characters in String\n4.Change odd characters to uppercase");
 	 		int option=scan.nextInt();
 	 		StringOperations st=new StringOperations();
 	 		st.display(option,str);
		}
		
	}

