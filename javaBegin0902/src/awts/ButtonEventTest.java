package awts;

import java.awt.*;
import java.awt.event.*;

public class ButtonEventTest {

	public static void main(String[] args) {
		final Frame f = new Frame("��ư �̺�Ʈ ����");
		
		Panel p = new Panel();
		Button closeBtn = new Button("â�ݱ�");
		
		closeBtn.setSize(70, 50);
		closeBtn.setLocation(40,30);
		
		//â�ݱ� ��ư�� ������ â�� �����ϵ��� �̺�Ʈ ó��
		closeBtn.addActionListener(
						new ActionListener(){
			
			@Override
			public void actionPerformed(
						 	ActionEvent e){
				f.dispose();
				System.exit(0);	
			}
		});
		
		p.setBackground(Color.pink);
		p.setLayout(null);
		p.add(closeBtn);
		
		f.add(p);
		
		//�������� â�ݱ� ��ư�� �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();
				System.exit(0);	
			}				
		});
		f.setSize(150, 150);
		f.setVisible(true);
		
	}

}
