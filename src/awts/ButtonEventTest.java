package awts;

import java.awt.*;
import java.awt.event.*;

public class ButtonEventTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frame f = new Frame("버튼이벤트 연습");
		
		Panel p = new Panel();
		
		
		Button bt = new Button("창닫기");
		bt.setSize(150, 100);
		bt.setLocation(40, 30);
		
		p.setBackground(Color.PINK);
		p.setLayout(null);
		p.add(bt, BorderLayout.CENTER);
		
		f.add(p);

		bt.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				System.exit(0);
				
			}
		});//bt.addActionListener;
		
		f.setSize(300, 200);
		
		f.setVisible(true);
		
		//프레임의 창닫기 버튼에 이벤트 처리
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
	}

}
