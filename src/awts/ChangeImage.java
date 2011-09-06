package awts;

import java.awt.*;
import java.awt.event.*;


public class ChangeImage extends Frame implements ActionListener, MouseListener {

	Image img, img2, imgNow ;
	Button bt = new Button("이미지 바꾸기");;
	String fileName1 = "C:/javaWorks/Dropbox/javaworks/image/lee.jpg";
	String fileName2 = "C:/javaWorks/Dropbox/javaworks/image/lee3.jpg";
	
	
	//기본생성자 오버로딩 화면에 프레임그리기
	ChangeImage(){		
		
		//프레임 설정
		setTitle("체인지 영애님");
		setSize(400, 500);
		setVisible(true);
		setBackground(Color.PINK);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		}
		);//f.addWindowListener(
		
		//버튼 추가
		add(bt, BorderLayout.NORTH);
		
		
		
		//toolkit
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage(fileName1);
		img2 = tk.getImage(fileName2);
		imgNow = img ;
		
		//button listener
		bt.addActionListener(this);
		
		
		//마우스 이벤트 리스너
		addMouseListener(this);
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(imgNow, 40, 40, this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (imgNow.equals(img)){
			imgNow = img2 ;
		}else{
			imgNow = img ;
		}
		this.repaint();
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		setBackground(Color.white);	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setBackground(Color.black);
	}	
	
	
	//메인 메소드
	public static void main(String[] args) {
		new ChangeImage();
	}

	
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}





}
