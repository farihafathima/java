package thread;
class Reservation extends Thread{
	public Reservation(ThreadGroup tg,String name){
		super(tg,name);
	}
	public void run() {
		System.out.println("Iam reservation Thread");
	}
}
class Cancellation extends Thread{
	public Cancellation(ThreadGroup tg,String name){
		super(tg,name);
	}
	public void run() {
		System.out.println("I am Cancellation Thread");
	}
}

public class Tgroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup tg=new ThreadGroup("First Group");
		Reservation res=new Reservation(tg,"First Thread");
		Reservation res1=new Reservation(tg,"Second Thread");
		
		ThreadGroup tg1=new ThreadGroup(tg,"Second Group");
		Cancellation can=new Cancellation(tg1,"Third Thread");
		Cancellation can1=new Cancellation(tg1,"Fourth Thread");
		///parent group of tg1
		System.out.println("Parent Group Of tg1 = "+tg1.getParent());
		//SET PRIORITY TG1 TO 7
		tg1.setMaxPriority(7);
		//Know the thread group of res and can
		System.out.println("Thread of First Thread = "+res.getThreadGroup());
		System.out.println("Thread of Second Thread = "+can.getThreadGroup());
		//start the threads
		res.start();
		res1.start();
		can.start();
		can1.start();
		//find how many threads are actively running
		System.out.println("Number of threads active in tg = "+tg.activeCount());
		System.out.println("Number of threads active in tg1 = "+tg1.activeCount());
	}

}
