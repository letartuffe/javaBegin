package awts;

import java.awt.*;
import java.awt.event.*;

public class BorderTest {

	public static void main(String[] args) {
		final Frame f = new Frame("BorderLayout 테스트");
		
		Button btn1, btn2;
		Label lbl;
		TextField t;
		TextArea ta;
		
		btn1 = new Button("서쪽 버튼");
		btn2 = new Button("동쪽 버튼");
		lbl = new Label("북쪽에는 레이블");
		t = new TextField("남쪽에는 텍스트 필드");
		ta = new TextArea("가운데는 누구??");
		
		//프레임에 위의 컴포넌트들 추가
		f.add("West", btn1);
		f.add("East", btn2);
		f.add("North", lbl);
		f.add(t, BorderLayout.SOUTH);
		f.add(ta, BorderLayout.CENTER);
		
		//프레임의 창닫기 버튼에 이벤트 처리
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);	
			}				
		});

		f.setSize(300, 300);
		f.setVisible(true);
	}

}
