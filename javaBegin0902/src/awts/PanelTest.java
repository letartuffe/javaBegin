package awts;

import java.awt.*;
import java.awt.event.*;

public class PanelTest {

	public static void main(String[] args) {
		final Frame f = new Frame("Panel 연습");
		
		Panel p01, p02, p03;
		
		p01 = new Panel();
		p02 = new Panel();
		p03 = new Panel();
		
		//각 패널의 배경색 지정
		p01.setBackground(Color.green);
		p02.setBackground(Color.YELLOW);
		p03.setBackground(Color.blue);
		
		//각 패널에 버튼 객체 추가
		p01.add(new Button("첫번째"));
		p02.add(new Button("두번째"));
		p03.add(new Button("세번째"));
						
		//각 패널을 프레임의 지정된 위치에 추가
		f.add(p01, "North");//프레임의 윗쪽에 p01추가
		f.add(p02, "Center");//프레임의 가운데에 p02추가
		f.add(p03, "South");//프레임의 아랫쪽에 p03 추가
		
		
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
