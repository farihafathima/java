package thread;

public class ThreadMethSync implements Runnable {
	int available=1;
	int wanted;
	public ThreadMethSync(int wanted) {
		super();
		this.wanted=wanted;
	}
	public synchronized void process() {
		System.out.println("Available bearths "+available);
		if(available>=wanted) {
			String name=Thread.currentThread().getName();
			System.out.println(wanted+" berths are reserved "+name);
			try {
				Thread.sleep(1500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
			available=available-wanted;
			
		}
		else {
			System.out.println("Sorry,no breaths");
		}
	}
	public void run() {
		process();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadMethSync t1=new ThreadMethSync(1);
		Thread thread1=new Thread(t1);
		Thread thread2=new Thread(t1);
		thread1.setName("First person");
		thread2.setName("Second person");
		thread1.start();
		thread2.start();
	}

}
