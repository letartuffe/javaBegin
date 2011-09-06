package basic;

import java.awt.*;
import java.awt.event.*;

public class ThreadRunnableTest 
			extends Frame
			implements Runnable{
	
	public ThreadRunnableTest(){
		setSize(300, 200);
		setVisible(true);
		
		//프레임의 창닫기 버튼에 이벤트 처리
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);	
			}				
		});
	}
	
	public static void main(String[] args) {
		ThreadRunnableTest rt;
		ThreadRunnableTest rt2;
		
		rt = new ThreadRunnableTest();		
		rt2 = new ThreadRunnableTest();
		
		Thread t = new Thread(rt);
		t.start();
		
		t = new Thread(rt2);		
		t.start();
	}

	@Override
	public void run() {
		int i=0 ;
		System.out.println("스레드 시작");
	
		while(i<=10){
			System.out.print(i + " => ");
			setTitle("스레드 동작 중 => " + i);
			i++;
			try {	Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("스레드 종료!");
	}

}










