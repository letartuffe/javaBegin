package awts;

import java.awt.*;
import java.awt.event.*;

public class ButtenTest {

	public static void main(String[] args) {
		//Frame �������� f ����
		//(Ÿ��Ʋ�ٴ� "���̹�ư"���� ǥ��)
		final Frame f = new Frame("���̹�ư");
		f.setLayout(null);	//�������� �⺻ ���̾ƿ� ����
		
		//Button ��ü ����
		//(��ư�� ���� "�̰��� ��ư"���� ǥ��)
		Button b = new Button("���� ��ư");
		b.setSize(100, 100);
		b.setLocation(50, 50);
		
		//�����ӿ� ��ư �߰�
		f.add(b);
		
		//������ ũ��� ���� ���� 200
		f.setSize(200, 200);
		//�����ӿ� â�ݱ� �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);	
			}				
		});
		//������ ���̰� ����
		f.setVisible(true);
	}

}
