package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.*;
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File obj=new File("far.txt");
//		try {
//			if(obj.createNewFile()) {
//				System.out.println("Created");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			FileWriter  writer=new FileWriter("far.txt");
//			writer.write("hello world");
//			writer.close();
//			System.out.println("updated");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			FileReader read =new FileReader("far.txt");
			Scanner reader=new Scanner(read);
			String data="";
			 while (reader.hasNextLine()) {
	                data = reader.nextLine();
	            }
			 System.out.println(data);
			 StringBuilder reversed = new StringBuilder(data).reverse();
			 String output = reversed.toString();
			 System.out.println(output);
			 reader.close();
			 try (FileWriter writer = new FileWriter("far.txt")) {
				writer.write(output);
			}
			 System.out.println("Written Successfully....");
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
