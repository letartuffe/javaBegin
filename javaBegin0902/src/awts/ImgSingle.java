package awts;

import java.awt.*;
import java.awt.event.*;

//Frame 상속 받기
public class ImgSingle extends Frame{
	
	Image img;	//Image 클래스의 참조변수 img 선언;
	String fileName  = "C:\\javaWorks\\images\\java.jpg"; 
	
	public ImgSingle(){
		Toolkit t = Toolkit.getDefaultToolkit();
		img = t.getImage(fileName);
		setTitle("단일 이미지 로딩!!");
		setSize(210, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);	
			}				
		});
		
	}
	
	//paint 메서드 오버라이딩
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 10, 40, this);
	}
	
	public static void main(String[] args) {
		new ImgSingle();
	}
}










