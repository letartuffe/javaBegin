package awts;

import java.awt.*;
import java.awt.event.*;

public class FlowTest {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			final Frame f = new Frame("FlowTest");
			//���̾ƿ� �޴���
			f.setLayout(new FlowLayout());
			

			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			f.add(new Button("sadf"));
			
			
			//������ ũ��� ���� ���� 200
			f.setSize(300, 300);

			//������ ���̰� ����
			f.setVisible(true);			
			
			
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
