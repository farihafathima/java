package debugging;

public class DebugExample {

	public static void main(String[] args) {
		
		
		System.out.println("Start");
		int a=10;
		System.out.println("Value of a : "+a);
		a=a+1;
		stepInto();
		//three ways to set breakpoints
		//1.Double click on the line
		//2.Right Click and toggle breakpoint
		//3.crt+shift+b
		System.out.println("value of a: "+a);
		System.out.println("For loop started: ");
		for (int i = 0; i < 6; i++) {
			
			if(a>30) {
			System.out.println("a value is greater than 30");
			}
			a=a+1;
			System.out.println("Value of a: "+a);
		}
		System.out.println("End");

	}
	private static void stepInto() {
		System.out.println("Entered into the new method");
		int b=10;
		System.out.println("value of b:"+b );
		b=b+2;
		show();
		System.out.println("value of b: "+b);
		
	}
	private static void show() {
		int c=3;
		System.out.println("value of c: "+c);
		c=c+1;
		System.out.println("value of c: "+c);
		
	}

}
//steps
//1.setting breakpoints
//2.step through
//3.step into