package awts;

import java.awt.*;
import java.awt.event.*;

public class FrameTest {

	public static void main(String[] args) {
		final Frame f = new Frame("여기는 타이틀바!");
		
		
		//프레임의 창닫기 버튼에 이벤트 처리
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);	
			}				
		});
		f.setSize(300, 200);
		f.setVisible(true);
		
	}

}










