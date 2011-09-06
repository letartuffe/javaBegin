package awts;

import java.awt.*;
import java.awt.event.*;

public class BorderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Frame f = new Frame("11111111");
		
		Button btn1, btn2 ;
		Label lb1;
		TextField t ;
		TextArea ta;
		
		//f.setLayout(null);
		
		btn1 = new Button ("서쪽버튼");
		btn2 = new Button ("동쪽버튼");
		lb1 = new Label("북쪽에는 레이블");
		t = new TextField("남쪽에는 텍스트 필드");
		ta = new TextArea("가운데는 누가??");
		//프레임 크기는 가로 세로 200
		f.setSize(300, 300);

		//프레임 보이게 설정
		f.setVisible(true);			
		
		f.add(btn1, BorderLayout.WEST);
		f.add(btn2, BorderLayout.EAST);
		f.add(lb1, BorderLayout.NORTH);
		f.add(t, BorderLayout.SOUTH);
		f.add(ta, BorderLayout.CENTER);
		
		lb1.setAlignment(1);
		
		
		//프레임의 창닫기 버튼에 이벤트 처리
		//프레임에 창닫기 이벤트 처리
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		

	}

}
