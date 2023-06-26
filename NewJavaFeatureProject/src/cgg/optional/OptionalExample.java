package cgg.optional;

import java.util.Optional;

public class OptionalExample {
	
	
	
	public static Optional<String> getName(){
		String name="abcd";
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {
		String str=null;
		Optional<String> ofNullable = Optional.ofNullable(str);
		
		System.out.println(ofNullable.isPresent());
	//	System.out.println(ofNullable.get());
		
		System.out.println(ofNullable.orElse("no value in this object"));
		
		Optional<String> name = getName();
		System.out.println(name.orElse("null return:"));
		
		
	}

}
