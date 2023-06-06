package thread;

public class Current {

	public static void main(String[] args) {
		System.out.println("Let us find current thread");
		Thread t=Thread.currentThread();
		System.out.println("Current thread="+t);
		System.out.println("its name="+t.getName());

	}

}
