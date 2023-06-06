package cgg.collections1;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetSortExample {

	public static void main(String[] args) {
		TreeSet<Emp> set=new TreeSet<>();
		set.add(new Emp("fariha","7348463288658",9));
		set.add(new Emp("fathima","7348463286677",7));
		set.add(new Emp("farisa","7348463288658",15));
		//Collections.sort(set);
		System.out.println(set);
		
		

	}

}
