package awts;


import java.awt.*;
import java.awt.event.*;


public class ButtenTest {

	public static void main(String[] args) {
		
		final Frame f = new Frame("�������� ��ӹ���");
		
		//���̾ƿ� �ʱ�ȭ
		f.setLayout(null);
		
		//��ư ��ü ����
		Button b = new Button("�����ư");
		b.setSize(100,100);
		b.setLocation(50, 50);
		
		//������ ũ��� ���� ���� 200
		f.setSize(200, 200);

		//������ ���̰� ����
		f.setVisible(true);
		
		f.add(b);
		
		
		
		
		
		
		
		
		
		//�������� â�ݱ� ��ư�� �̺�Ʈ ó��
		//�����ӿ� â�ݱ� �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		
		//�������� â�ݱ� ��ư�� �̺�Ʈ ó��
		//�����ӿ� â�ݱ� �̺�Ʈ ó��
		b.addActionListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				
				System.exit(0);
			}
		}
		
		);//b.addWindowListener(
	}

}
