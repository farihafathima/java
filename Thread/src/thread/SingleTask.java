package thread;
class ThreadTest extends Thread{
	public void run() {
		task1();
		task2();
		task3();
	}
	public void task1() {
		System.out.println("Task1..");
	}
	public void task2() {
		System.out.println("Task2..");
	}
	public void task3() {
		System.out.println("Task3..");
	}
}
public class SingleTask {

	public static void main(String[] args) {
		ThreadTest test=new ThreadTest();
		test.start();

	}

}
