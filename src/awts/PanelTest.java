package awts;

import java.awt.*;
import java.awt.event.*;

public class PanelTest {

	public static void main(String[] args) {
		
		final Frame f = new Frame("�г� ����");
		
		//Panel ���� ����  p01, p02, p03 ���� �� ����
		Panel p01 = new Panel();
		Panel p02 = new Panel();
		Panel p03 = new Panel();
		
		//p01�� ���� �ʷϻ����� ����
		p01.setBackground(Color.GREEN);
		//p02�� ���� ������� ����
		p02.setBackground(Color.YELLOW);
		//p03�� ���� �Ķ����� ����
		p03.setBackground(Color.BLUE);

		//p01�� ��ư ��ü ����, �߰�, "ù��°" ���ڿ�
		p01.add(new Button("ù��°"));
		//p02�� ��ư ��ü ����, �߰�, "�ι�°" ���ڿ�
		p02.add(new Button("�ι�°"));
		//p03�� ��ư ��ü ����, �߰�, "����°" ���ڿ�
		p03.add(new Button("����°"));
		
		
		//�������� ���ʿ� p01�߰�
		//�������� ����� p02�߰�
		//�������� �Ʒ��ʿ� p03�߰�
		f.add(p01, BorderLayout.NORTH);
		f.add(p02, BorderLayout.CENTER);
		f.add(p03, BorderLayout.SOUTH);
		
		
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
