package thread;
public class Reserve implements Runnable{
	int available=1;
	int wanted=1;
	public Reserve(int wanted) {
		super();
		this.wanted=wanted;
	}
	public void run() {
		System.out.println("Available bearths "+available);
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
			System.out.println("Sorry,no breaths");
		}
	}

	public static void main(String[] args) {
		Reserve t1=new Reserve(1);
		Reserve t2=new Reserve(1);
		Thread thread1=new Thread(t1);
		Thread thread2=new Thread(t2);
		thread1.setName("First person");
		thread2.setName("Second person");
		thread1.start();
		thread2.start();

	}

}
