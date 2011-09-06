package awts;

import java.awt.*;
import java.awt.event.*;

public class BorderTest {

	public static void main(String[] args) {
		final Frame f = new Frame("BorderLayout �׽�Ʈ");
		
		Button btn1, btn2;
		Label lbl;
		TextField t;
		TextArea ta;
		
		btn1 = new Button("���� ��ư");
		btn2 = new Button("���� ��ư");
		lbl = new Label("���ʿ��� ���̺�");
		t = new TextField("���ʿ��� �ؽ�Ʈ �ʵ�");
		ta = new TextArea("����� ����??");
		
		//�����ӿ� ���� ������Ʈ�� �߰�
		f.add("West", btn1);
		f.add("East", btn2);
		f.add("North", lbl);
		f.add(t, BorderLayout.SOUTH);
		f.add(ta, BorderLayout.CENTER);
		
		//�������� â�ݱ� ��ư�� �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);	
			}				
		});

		f.setSize(300, 300);
		f.setVisible(true);
	}

}
