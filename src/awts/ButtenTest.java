package awts;


import java.awt.*;
import java.awt.event.*;


public class ButtenTest {

	public static void main(String[] args) {
		
		final Frame f = new Frame("프레임을 상속받자");
		
		//레이아웃 초기화
		f.setLayout(null);
		
		//버튼 객체 생성
		Button b = new Button("종료버튼");
		b.setSize(100,100);
		b.setLocation(50, 50);
		
		//프레임 크기는 가로 세로 200
		f.setSize(200, 200);

		//프레임 보이게 설정
		f.setVisible(true);
		
		f.add(b);
		
		
		
		
		
		
		
		
		
		//프레임의 창닫기 버튼에 이벤트 처리
		//프레임에 창닫기 이벤트 처리
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		
		//프레임의 창닫기 버튼에 이벤트 처리
		//프레임에 창닫기 이벤트 처리
		b.addActionListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				
				System.exit(0);
			}
		}
		
		);//b.addWindowListener(
	}

}
