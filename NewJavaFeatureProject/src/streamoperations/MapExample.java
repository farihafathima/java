package streamoperations;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("C:\\MyFile.txt");
		l.add("D:\\MyFile1.txt");
		l.add("C:\\MyFile2.txt");
		l.add("D:\\MyFile3.txt");
		l.add("D:\\MyFile4.txt");
		
		Stream<Path> map=l.stream().map(uri->Paths.get(uri));
		map.forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------");
		
		 List<Details> list = new ArrayList<Details>();
		 
		 List<String> l2=new ArrayList<String>();
		 l2.add("parts_1");
		 l2.add("parts_2");
		 l2.add("parts_3");
		 l2.add("parts_4");
		 
		 
		 List<String> l1=new ArrayList<String>();
		 l1.add("parts1_1");
		 l1.add("parts1_2");
		 l1.add("parts1_3");
		 l1.add("parts1_4");
		 
		Details details= new Details(1001,l);
		Details details1= new Details(1001,l1);
		
		list.add(details);
		list.add(details1);
		
		Stream<String> flatMap = list.stream().flatMap(d->d.getParts().stream());
		
		flatMap.forEach(System.out::println);
		
		
		 
		

	}

}
