package thread;
class MyLoopDemo{
	String stop=false;
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println();
		}
		
	}
}

public class LoopDemo {

	public static void main(String[] args) {
	MyLoopThread l=new MyLoopThread();
	l.setName("Firat");
	l.start;
	System.in.read();
	l.stop=true;
	

	}

}
