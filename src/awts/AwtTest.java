package awts;

import java.awt.*;
import java.awt.event.*;

public class AwtTest extends Frame {
	
	GridBagLayout gb;
	GridBagConstraints gbc;
	
	AwtTest(){
		
		setSize(400, 600);
		setVisible(true);
		setTitle("������");
	
		gb = new GridBagLayout();
		setLayout(gb);
		
		gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH;
		
		CheckboxGroup group = new CheckboxGroup();
		
		addToFrame(new Label("��    ��"), 0,0,1,1, 1.0 , 1.0);
		addToFrame(new TextField("222", 10), 1,0,1,1, 1.0 , 1.0);
		addToFrame(new Label("��   ��"), 2,0,1,1, 1.0 , 1.0);
		addToFrame(new Checkbox("����", group, true), 3,0,1,1, 0.5 , 1.0);
		addToFrame(new Checkbox("����", group, false), 4,0,1,1, 0.5 , 1.0);
		
		addToFrame(new Label("�ֹε�Ϲ�ȣ"), 0,1,1,1, 1.0 , 1.0);
		addToFrame(new TextField("6"), 1,1,1,1, 1.0 , 1.0);
		addToFrame(new Label("-"), 2,1,1,1, 1.0 , 1.0);
		addToFrame(new TextField("8"), 3,1,2,1, 1.0 , 1.0);
		
		
		addToFrame(new Label("�ּ�"), 0,2,1,1, 1.0 , 1.0);
		addToFrame(new TextField(""), 1,2,4,1, 1.0 , 1.0);
		Choice list1 ;
		addToFrame(new Label("�μ���"), 0,3,1,1, 1.0 , 1.0);
		addToFrame(list1 = new Choice(), 1,3,4,1, 1.0 , 1.0);
		list1.addItem("��ȹ��");
		list1.addItem("�����");		
		
		addToFrame(new Label("���"), 0,4,1,1, 1.0 , 1.0);
		addToFrame(new Checkbox("�",true), 1,4,1,1, 1.0 , 1.0);
		addToFrame(new Checkbox("����",false), 2,4,1,1, 1.0 , 1.0);
		addToFrame(new Checkbox("��ȭ",false), 3,4,1,1, 1.0 , 1.0);
		
		
		
		addToFrame(new TextField("�ڱ�Ұ�"), 0,5,5,1, 1.0 , 1.0);
		addToFrame(new TextArea("�ڱ�Ұ�"), 0,6,5,1, 1.0 , 1.0);
		
		
		addToFrame(new Panel(), 0,7,1,1, 1.0 , 1.0);
		addToFrame(new Panel(), 1,7,1,1, 1.0 , 1.0);
		addToFrame(new Button("����"), 2,7,1,1, 1.0 , 1.0);
		addToFrame(new Button("����"), 3,7,1,1, 1.0 , 1.0);
		addToFrame(new Panel(), 4,7,1,1, 1.0 , 1.0);
		
		
		setBounds(200,200,400,600);
		
		
			
		//�������� â�ݱ� ��ư�� �̺�Ʈ ó��
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		
		
	}
	
	
	private void addToFrame(Component com, int x, int y, int width, int height, double weightx, double weighty			) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height ;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		add(com, gbc);
		
	}


	public static void main(String[] args) {
		new AwtTest();
	}

}
