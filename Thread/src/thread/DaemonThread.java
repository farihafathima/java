package thread;
class MyDaemonThread extends Thread{
	public void run() {
		System.out.println("Iam Daemon");
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDaemonThread myDaemon=new MyDaemonThread();
		myDaemon.setDaemon(true);
		System.out.println(myDaemon.isDaemon());

	}

}
