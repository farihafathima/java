package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		try {
			FileReader reader=new FileReader("name.txt");
			BufferedReader br=new BufferedReader(reader);
			LineNumberReader lr=new LineNumberReader(br);
			
			while((s=lr.readLine())!=null) {
				System.out.println(lr.getLineNumber()+" "+s);
				
			}
			lr.close();
			br.close();
			reader.close();
			
		}
			catch(IOException e) {
				e.printStackTrace();
			}
	}

}
