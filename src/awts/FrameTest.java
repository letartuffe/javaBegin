package awts;

import java.awt.*;
import java.awt.event.*;

public class FrameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frame f = new Frame();
		
		//�������� â�ݱ� ��ư�� �̺�Ʈ ó��
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
