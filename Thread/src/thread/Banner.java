package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Banner extends Frame implements Runnable {
	String str="Center For Good Governanace";
	public Banner() {
		setLayout(null);
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void paint(Graphics g) {
		Font font =new Font("Courier",Font.BOLD,40);
		g.setFont(font);
		g.drawString(str,100,100);
	}
	public void run() {
		for(;;) {
			repaint();
			try {
				Thread.sleep(400);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			char ch=str.charAt(0);
			str=str.substring(1,str.length());
			str=str+ch;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banner b=new Banner();
		b.setSize(700,700);
		b.setTitle("My Banner");
		b.setVisible(true);
		b.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Thread t=new Thread(b);
		t.start();
	}

}
