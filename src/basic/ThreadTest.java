package basic;

import java.awt.*;
import java.awt.event.*;

public class ThreadTest extends Frame implements Runnable{
	
	ThreadTest(){
		setTitle("ü���� ���ִ�");
		setSize(400, 500);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		}
		);//f.addWindowListener(
		
	}
	public void run(){
		
		int i = 0;
		System.out.println("������ ����");
		while(i<=10){
			setTitle("������ ������ --> " + i);
			System.out.print(i + " -> ");
			i++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("������ ����");
		}
		
	}
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt);
		t.start();
		
	}

}
