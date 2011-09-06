package awts;

import java.awt.*;
import java.awt.event.*;

//Frame 클래스를 상속받아서 
public class FrameExtendsTest extends Frame{

	//기본 생성자를 오버로딩하여
	//프레임의 창닫기 이벤트 처리
	public FrameExtendsTest(){
	
		setTitle("프레임을 상속받자!!");
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
		new FrameExtendsTest();
	}

}
