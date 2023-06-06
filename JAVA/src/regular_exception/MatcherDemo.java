package regular_exception;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherDemo {

	public static void main(String[] args) {
		String input="shop.hop.hopping.chopping";
	 Pattern pattern=Pattern.compile("hop");
	 Matcher matcher=pattern.matcher(input);
	 System.out.println(matcher.matches());
	 while(matcher.find()) {
		 System.out.println(matcher.group()+":"+matcher.start()+":"+matcher.end());
	 }
	 
	 

	}

}
