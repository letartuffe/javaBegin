package awts;

import java.awt.*;
import java.awt.event.*;

public class FlowTest {

	public static void main(String[] args) {
		final Frame f = new Frame("����� Ÿ��Ʋ��!");
		f.setLayout(new FlowLayout());
		
		f.add(new Button("ù��°"));
		f.add(new Button("�ι�°"));
		f.add(new Button("����°"));
		f.add(new Button("�׹�°"));
		f.add(new Button("�ټ���°"));
		
		
		
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
