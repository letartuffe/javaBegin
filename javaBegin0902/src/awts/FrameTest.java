package awts;

import java.awt.*;
import java.awt.event.*;

public class FrameTest {

	public static void main(String[] args) {
		final Frame f = new Frame("����� Ÿ��Ʋ��!");
		
		
		//�������� â�ݱ� ��ư�� �̺�Ʈ ó��
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










