package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadWrite1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path file=Paths.get("C:\\Users\\CGG\\Downloads\\html\\File1.txt");
			List<String> lines=Files.readAllLines(file);
			System.out.println(lines);
			for(String line:lines) {
				System.out.println(line);
			}
			System.out.println("End of FILE...");
			}
		catch(Exception e) {
	}
	}

}
