package thread;
import java.lang.*;
public class Theatre implements Runnable {
		String str1;
		Theatre(String str1){
			this.str1=str1;
		}
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println(str1+" "+i);
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	public static void main(String[] args) {
		Theatre thread=new Theatre("book the ticket");
		Theatre thread1=new Theatre("show the seat");
		
		Thread t1=new Thread(thread);
		Thread t2=new Thread(thread1);
		t1.start();
		t2.start();

	}

}
