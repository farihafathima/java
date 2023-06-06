package thread;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServe implements Runnable {
	static ServerSocket ss;
	static Socket s;
	public void run() {
		String name=Thread.currentThread().getName();
		for(;;) {
			System.out.println("Thread"+name+"ready tho accept....");
			try {
				s=ss.accept();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("Thread"+name+" accepted connection");
			//for sending message
			PrintStream ps=null;
			try {
			ps=new PrintStream(s.getOutputStream());
		}catch(IOException e) {
			e.printStackTrace();
		}
			ps.println("thread "+name+"contacted you");
			ps.close();
			try {
				s.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiServe multiServe=new MultiServe();
		//create server socket with port 999
		try {
			ss=new ServerSocket(999);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t1=new Thread(multiServe,"one");
		Thread t2=new Thread(multiServe,"Two");
		t1.start();
		t2.start();
	}

}
