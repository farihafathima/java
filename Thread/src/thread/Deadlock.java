package thread;
class BookTicket extends Thread{
	Object train,comp;
	BookTicket(Object train,Object comp){
		this.train=train;
		this.comp=comp;
		
	}
	public void run() {
		synchronized(train) {
		System.out.println("Book ticket locked on train");
		try {
		Thread.sleep(150);}
		catch(InterruptedException e) {}
		System.out.println("Book tickect waiting for compartment.....");
		synchronized(comp) {
			System.out.println("Book ticket locked on compartment...");
		}
	}
}}
class CancellTicket extends Thread{
		Object train,comp;
		CancellTicket(Object train,Object comp){
			this.train=train;
			this.comp=comp;
			
		}
		public void run() {
			synchronized(train) {
			System.out.println("Cancell ticket locked on compartment");
			try {
			Thread.sleep(200);}
			catch(InterruptedException e) {}
			System.out.println("cancell tickect waiting for train.....");
			synchronized(comp) {
				System.out.println("cancell ticket locked on train...");
			}
		}
	}}

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object train=new Object();
		Object comp=new Object();
		BookTicket bookTicket=new BookTicket(train,comp);
		CancellTicket cancellTicket=new CancellTicket(train,comp);
		bookTicket.start();
		cancellTicket.start();
		
		

	}

}
