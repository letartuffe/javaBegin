package awts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame Ŭ������ ��ӹ޾Ƽ�
//��� �޾ұ� ������ ���� ó�� �׳� ��.. new �ؼ� ��ü �����ؼ� �� �ʿ䰡 ����.


public class FrameExtendsTest extends Frame {
	
	public FrameExtendsTest(){
		
		setTitle("�������� ��ӹ���");
		setSize(300, 200);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		
	}
	
	public static void main(String[] args) {
		
		//FrameExtendsTest a  = new FrameExtendsTest();
		new FrameExtendsTest();
	}

}
