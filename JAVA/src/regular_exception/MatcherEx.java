package regular_exception;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherEx {

	public static void main(String[] args) {
		String input="Acevfwieufb9";
		Pattern p=Pattern.compile("[A-Z][a-z]*[0-9]$");
		Matcher matcher=p.matcher(input);
		//System.out.print(matcher.find());
		if(!matcher.find()) {
			System.out.println("Enter that starts with upper case letter and ends with digit");
		}

	}

}
