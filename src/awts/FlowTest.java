package awts;

import java.awt.*;
import java.awt.event.*;

public class FlowTest {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			final Frame f = new Frame("FlowTest");
			//레이아웃 메니져
			f.setLayout(new FlowLayout());
			

			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			
			
			//프레임 크기는 가로 세로 200
			f.setSize(300, 300);

			//프레임 보이게 설정
			f.setVisible(true);			
			
			
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
