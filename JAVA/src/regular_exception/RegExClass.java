package regular_exception;
import java.util.regex.Pattern;
public class RegExClass {

	public static void main(String[] args) {
		String inputStr="test string";
		String pattern="test string";
		boolean matches=Pattern.matches(pattern,inputStr);
		System.out.println(matches);

	}

}
