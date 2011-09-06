package awts;

import java.awt.*;
import java.awt.event.*;

public class PanelTest {

	public static void main(String[] args) {
		
		final Frame f = new Frame("패널 연습");
		
		//Panel 참조 변수  p01, p02, p03 선언 및 생성
		Panel p01 = new Panel();
		Panel p02 = new Panel();
		Panel p03 = new Panel();
		
		//p01의 배경색 초록색으로 지정
		p01.setBackground(Color.GREEN);
		//p02의 배경색 노랑으로 지정
		p02.setBackground(Color.YELLOW);
		//p03의 배경색 파랑으로 지정
		p03.setBackground(Color.BLUE);

		//p01에 버튼 객체 생성, 추가, "첫번째" 문자열
		p01.add(new Button("첫번째"));
		//p02에 버튼 객체 생성, 추가, "두번째" 문자열
		p02.add(new Button("두번째"));
		//p03에 버튼 객체 생성, 추가, "세번째" 문자열
		p03.add(new Button("세번째"));
		
		
		//프레임의 윗쪽에 p01추가
		//프레임의 가운데에 p02추가
		//프레임의 아래쪽에 p03추가
		f.add(p01, BorderLayout.NORTH);
		f.add(p02, BorderLayout.CENTER);
		f.add(p03, BorderLayout.SOUTH);
		
		
		//프레임의 창닫기 버튼에 이벤트 처리
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		f.setSize(300, 200);
		
		f.setVisible(true);

	}

}
