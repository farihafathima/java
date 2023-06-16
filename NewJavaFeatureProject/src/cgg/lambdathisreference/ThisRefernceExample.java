package cgg.lambdathisreference;

public class ThisRefernceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=30;
//		ThisRefernceExample.doOperate(i, new Operation() {
//
//			@Override
//			public void operate(int b) {
//				System.out.println(i+b);
//				System.out.println(this);
//				
//			}
//			
//		});
		
//		doOperate(int i,b->{
//			System.out.println(b+i);
//			//System.out.println(this);
//		});
		
		ThisRefernceExample obj = new ThisRefernceExample();
		obj.process();
		
		
		
		

	}
	private static void doOperate(int i,Operation o) {
		o.operate(i);
	}
	public void process() {
		doOperate(30,n->{
			System.out.println(30+n);
			System.out.println(this);
		});
	}
}
