package awts;

import java.awt.*;
import java.awt.event.*;

//Frame Ŭ������ ��ӹ޾Ƽ� 
public class FrameExtendsTest extends Frame{

	//�⺻ �����ڸ� �����ε��Ͽ�
	//�������� â�ݱ� �̺�Ʈ ó��
	public FrameExtendsTest(){
	
		setTitle("�������� ��ӹ���!!");
		setSize(300, 200);
		setVisible(true);
		
		//�������� â�ݱ� ��ư�� �̺�Ʈ ó��
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);	
			}				
		});
	}
	
	
	public static void main(String[] args) {
		new FrameExtendsTest();
	}

}
