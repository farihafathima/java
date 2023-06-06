package lab41;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadWrite {

	public static void main(String[] args) {
		try {
			Path file=Paths.get("C:\\Users\\CGG\\Downloads\\html\\home.html");
			List<String> lines=Files.readAllLines(file);
			for(String line:lines) {
				System.out.println(line);
			}
			System.out.println("End of the File......");

	}catch(Exception e) {}

}
}