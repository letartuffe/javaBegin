package awts;

import java.awt.*;
import java.awt.event.*;

public class PanelTest {

	public static void main(String[] args) {
		final Frame f = new Frame("Panel ����");
		
		Panel p01, p02, p03;
		
		p01 = new Panel();
		p02 = new Panel();
		p03 = new Panel();
		
		//�� �г��� ���� ����
		p01.setBackground(Color.green);
		p02.setBackground(Color.YELLOW);
		p03.setBackground(Color.blue);
		
		//�� �гο� ��ư ��ü �߰�
		p01.add(new Button("ù��°"));
		p02.add(new Button("�ι�°"));
		p03.add(new Button("����°"));
						
		//�� �г��� �������� ������ ��ġ�� �߰�
		f.add(p01, "North");//�������� ���ʿ� p01�߰�
		f.add(p02, "Center");//�������� ����� p02�߰�
		f.add(p03, "South");//�������� �Ʒ��ʿ� p03 �߰�
		
		
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
