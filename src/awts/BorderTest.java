package awts;

import java.awt.*;
import java.awt.event.*;

public class BorderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Frame f = new Frame("11111111");
		
		Button btn1, btn2 ;
		Label lb1;
		TextField t ;
		TextArea ta;
		
		//f.setLayout(null);
		
		btn1 = new Button ("���ʹ�ư");
		btn2 = new Button ("���ʹ�ư");
		lb1 = new Label("���ʿ��� ���̺�");
		t = new TextField("���ʿ��� �ؽ�Ʈ �ʵ�");
		ta = new TextArea("����� ����??");
		//������ ũ��� ���� ���� 200
		f.setSize(300, 300);

		//������ ���̰� ����
		f.setVisible(true);			
		
		f.add(btn1, BorderLayout.WEST);
		f.add(btn2, BorderLayout.EAST);
		f.add(lb1, BorderLayout.NORTH);
		f.add(t, BorderLayout.SOUTH);
		f.add(ta, BorderLayout.CENTER);
		
		lb1.setAlignment(1);
		
		
		//�������� â�ݱ� ��ư�� �̺�Ʈ ó��
		//�����ӿ� â�ݱ� �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		

	}

}
