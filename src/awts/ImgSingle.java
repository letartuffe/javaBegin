package awts;

import java.awt.*;
import java.awt.event.*;


public class ImgSingle extends Frame {
	
	Image img ;

	String fileName = "C:/javaWorks/Dropbox/javaworks/image/lee.jpg";
	
	
	
	
	
	
	
	
	//기본생성자 오버로딩 화면에 프레임그리기
	ImgSingle(){		
		
		setTitle("영애님");
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
