package awts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame 클래스를 상속받아서
//상속 받았기 떄문에 내것 처럼 그냥 됨.. new 해서 객체 생성해서 쓸 필요가 없음.


public class FrameExtendsTest extends Frame {
	
	public FrameExtendsTest(){
		
		setTitle("프레임을 상속받자");
		setSize(300, 200);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		
	}
	
	public static void main(String[] args) {
		
		//FrameExtendsTest a  = new FrameExtendsTest();
		new FrameExtendsTest();
	}

}
