package cgg.privatemethods;

public class WelcomeDemo implements Welcome {

	public static void main(String[] args) {
		Welcome welcome=new WelcomeDemo();
		welcome.hi();
		welcome.greet();
		Welcome.test();
		

	}
	
	public void hi() {
		System.out.println("hi");
	}

}
