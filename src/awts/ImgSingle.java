package awts;

import java.awt.*;
import java.awt.event.*;


public class ImgSingle extends Frame {
	
	Image img ;

	String fileName = "C:/javaWorks/Dropbox/javaworks/image/lee.jpg";
	
	
	
	
	
	
	
	
	//�⺻������ �����ε� ȭ�鿡 �����ӱ׸���
	ImgSingle(){		
		
		setTitle("���ִ�");
		setSize(300, 200);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		
		
		
		//toolkit
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage(fileName);
	
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 40, 40, this);
	}

	public static void main(String[] args) {
		new ImgSingle() ;
	}

}
