package awts;

import java.awt.*;
import java.awt.event.*;

public class ButtenTest {

	public static void main(String[] args) {
		//Frame 참조변수 f 생성
		//(타이틀바는 "마이버튼"으로 표시)
		final Frame f = new Frame("마이버튼");
		f.setLayout(null);	//프레임의 기본 레이아웃 제거
		
		//Button 객체 생성
		//(버튼의 라벨은 "이것이 버튼"으로 표시)
		Button b = new Button("종료 버튼");
		b.setSize(100, 100);
		b.setLocation(50, 50);
		
		//프레임에 버튼 추가
		f.add(b);
		
		//프레임 크기는 가로 세로 200
		f.setSize(200, 200);
		//프레임에 창닫기 이벤트 처리
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);	
			}				
		});
		//프레임 보이게 설정
		f.setVisible(true);
	}

}
