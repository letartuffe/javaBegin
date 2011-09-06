package awts;

import java.awt.*;
import java.awt.event.*;

public class ButtonEventTest2 extends Frame implements ActionListener, MouseListener{

	
	Button btRed , btBlue ;
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btBlue)){
			setBackground(Color.BLUE);
		}else {
			setBackground(Color.RED);
		}
	}
	
	
	
	
	
	public ButtonEventTest2(){
		
		
		setTitle("프레임을 상속받자");
		setSize(300, 200);
		setVisible(true);
		
		//프레임 종료 이벤트 처리
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		});		
		
		btRed = new Button("빨강");
		btBlue = new Button("파랑");
		
		btRed.setSize(100, 100);
		btBlue.setSize(100, 100);
		
		btRed.setLocation(20, 30);
		btBlue.setLocation(150, 30);
		
		setBackground(Color.PINK);
		setLayout(null);

		add(btRed);
		add(btBlue);
		

		btRed.addActionListener(this);
		btBlue.addActionListener(this);
		
		btRed.addMouseListener(this);
		addMouseListener(this);
		
		
		
		//프레임의 창닫기 버튼에 이벤트 처리
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		}
		
		);//f.addWindowListener(
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new ButtonEventTest2();
		
		
	}





	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
			setBackground(Color.white);
	}





	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

		setBackground(Color.black);
		if(e.getSource().equals(btRed)){
			setBackground(Color.red);
		}
	}	
}	
	
		