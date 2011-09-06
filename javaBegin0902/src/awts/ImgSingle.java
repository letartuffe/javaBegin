package awts;

import java.awt.*;
import java.awt.event.*;

//Frame ��� �ޱ�
public class ImgSingle extends Frame{
	
	Image img;	//Image Ŭ������ �������� img ����;
	String fileName  = "C:\\javaWorks\\images\\java.jpg"; 
	
	public ImgSingle(){
		Toolkit t = Toolkit.getDefaultToolkit();
		img = t.getImage(fileName);
		setTitle("���� �̹��� �ε�!!");
		setSize(210, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);	
			}				
		});
		
	}
	
	//paint �޼��� �������̵�
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 10, 40, this);
	}
	
	public static void main(String[] args) {
		new ImgSingle();
	}
}










