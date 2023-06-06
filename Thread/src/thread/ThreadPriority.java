package thread;
class MyClass extends Thread{
	int count;
	MyClass(String s){
		super(s);
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			count++;
		}
		System.out.println("Complete thread :"+this.getName());
		System.out.println("Its Priority :"+this.getPriority());
	}
}
public class ThreadPriority {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass thread=new MyClass("One");
		MyClass thread1=new MyClass("Two");
		

		thread1.setPriority(10);
		thread.setPriority(2);
		thread.start();
		thread1.start();
	}

}
