package cgg.closure;

public class ClosureExample {

	public static void main(String[] args) {
		int x=30;
		int y=40;
//		doOperate(x,new Operation() {
//			public void operate(int i) {
//				//x=300; effectively final
//				System.out.println(i+y);
//			}
//		});
		
		doOperate(x,i->{
			//y=100;
			System.out.println(i+y);
		});
	}
	
	
	private static void doOperate(int i,Operation o) {
		o.operate(i);
	}

}
