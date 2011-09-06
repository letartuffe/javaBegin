package awts;

import java.awt.*;
import java.awt.event.*;

public class ButtonEventTest {

	public static void main(String[] args) {
		final Frame f = new Frame("버튼 이벤트 연습");
		
		Panel p = new Panel();
		Button closeBtn = new Button("창닫기");
		
		closeBtn.setSize(70, 50);
		closeBtn.setLocation(40,30);
		
		//창닫기 버튼을 누르면 창을 종료하도록 이벤트 처리
		closeBtn.addActionListener(
						new ActionListener(){
			
			@Override
			public void actionPerformed(
						 	ActionEvent e){
				f.dispose();
				System.exit(0);	
			}
		});
		
		p.setBackground(Color.pink);
		p.setLayout(null);
		p.add(closeBtn);
		
		f.add(p);
		
		//프레임의 창닫기 버튼에 이벤트 처리
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);	
			}				
		});
		f.setSize(150, 150);
		f.setVisible(true);
		
	}

}
