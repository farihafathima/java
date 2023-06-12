package cgg.defaultandstaticmethods;

public class ImpI1I2 implements I1,I2 {
	
	@Override
	public void greetings(String name) {
		I1.super.greetings(name);
	}
	
	public static void main(String[] args) {
		I1 interface1=new ImpI1I2();
		interface1.greetings("Fariha");
	}

}
