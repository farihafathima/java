package thread;
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		System.out.println(this.getName());
	}
}

public class FirstThreadDemo {

	public static void main(String[] args) {
		MyThread myThread=new MyThread("First Thread");
		myThread.start();
		MyThread myThread1=new MyThread("Second name");
		myThread1.start();
		System.out.println("fist:"+myThread.getName());
		System.out.println("second:"+myThread1.getName());

	}

}
