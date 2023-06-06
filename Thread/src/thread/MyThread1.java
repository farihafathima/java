package thread;

public class MyThread1 extends Thread {
	public MyThread1(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Thread Name "+getName());
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread1 thread=new MyThread1("First Thread");
		thread.start();
		MyThread1 thread1 =new MyThread1("Second Thread");
		thread1.start();
		boolean allive=thread.isAlive();
		System.out.println("First thread is alive "+allive);
		thread.join();
		thread1.join();
		allive=thread.isAlive();
		System.out.println("First thread is alive "+allive);
		System.out.println("Main ends");
		
	}

}
