package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class NumerFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File  f=new File("number.txt");
//		try {
//			if(f.createNewFile()) {
//				System.out.println("File created....");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try(FileReader reader = new FileReader("number.txt")) {
			Scanner read=new Scanner(reader);
			String data="";
			 while (read.hasNextLine()) {
	                data = read.nextLine(); 
	            }
			 String[] parts = data.split(",");
			 for(String i:parts) {
				 if((Integer.parseInt(i))%2==0) {
					 System.out.println(i);
				 }
			 }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

	}

}
