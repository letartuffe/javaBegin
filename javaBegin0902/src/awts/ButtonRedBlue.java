package awts;

import java.awt.*;
import java.awt.event.*;

public class ButtonRedBlue extends Frame 
					       implements ActionListener{
	
	Button redBtn;
	Button blueBtn;
	
	//�⺻ �����ڸ� �����ε�
	public ButtonRedBlue(){
		redBtn = new Button("����");
		blueBtn = new Button("�Ķ�");
		
		setLayout(new FlowLayout());
		
		//������ ��ư�� �׼Ǹ����� ���
		redBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		
		add(redBtn);
		add(blueBtn);
		
		setTitle("������ư �Ķ���ư!!");
		setSize(150, 150);
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
		new ButtonRedBlue();
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		//�߻��� �̺�Ʈ �ҽ��� ��ü�� ����
		Object obj = e.getSource();
		
		//Ȯ���ؼ� ���� ����		
		if(obj == redBtn){//���� ��ư�� ���ȴ��� 
			
		}else if(obj == blueBtn){ //�Ķ� ��ư�� ���ȴ���
			
		}
	}

}












