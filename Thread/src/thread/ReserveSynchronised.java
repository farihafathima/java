package thread;

public class ReserveSynchronised implements Runnable {
	int available=1;
	int wanted;
	public ReserveSynchronised(int wanted) {
		super();
		this.wanted=wanted;
	}
	public void run() {
		synchronized(this) {
			System.out.println("Available berths "+available);
		if(available>=wanted) {
			String name=Thread.currentThread().getName();
			System.out.println(wanted+"berths are reserved "+name);
			try {
				Thread.sleep(1500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
			available=available-wanted;
			
		}
		else {
			System.out.println("Sorry,no berths");
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReserveSynchronised t1=new ReserveSynchronised(1);
		Thread thread1=new Thread(t1);
		Thread thread2=new Thread(t1);
		thread1.setName("First person");
		thread2.setName("Second person");
		thread1.start();
		thread2.start();

	}

}
