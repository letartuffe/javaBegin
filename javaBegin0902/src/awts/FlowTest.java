package awts;

import java.awt.*;
import java.awt.event.*;

public class FlowTest {

	public static void main(String[] args) {
		final Frame f = new Frame("여기는 타이틀바!");
		f.setLayout(new FlowLayout());
		
		f.add(new Button("첫번째"));
		f.add(new Button("두번째"));
		f.add(new Button("세번째"));
		f.add(new Button("네번째"));
		f.add(new Button("다섯번째"));
		
		
		
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
