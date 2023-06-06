package thread;
class Producer extends Thread{
	StringBuffer sb;
//	boolean dataprodover=false;
	public Producer() {
		sb=new StringBuffer();
	}
	public void run() {
		synchronized(sb) {
		for(int i=0;i<10;i++) {
			try {
				sb.append(i+":");
				Thread.sleep(100);
				System.out.println("Appending");
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		sb.notify();
//		dataprodover=true;
	}}
	
}
class Consumer extends Thread{
	Producer pro;
	public Consumer(Producer pro) {
		this.pro=pro;
	}
	public void run() {
//		try {
//			while(!pro.dataprodover) {
//				Thread.sleep(10);
//			}
//		}
//		catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		synchronized(pro.sb) {
		try {
			pro.sb.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
		System.out.println(pro.sb);
}}


public class Communicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer pro=new Producer();
		Consumer cons=new Consumer(pro);
		cons.start();
		pro.start();
		
		
	}

}
