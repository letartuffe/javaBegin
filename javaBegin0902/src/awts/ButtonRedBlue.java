package awts;

import java.awt.*;
import java.awt.event.*;

public class ButtonRedBlue extends Frame 
					       implements ActionListener{
	
	Button redBtn;
	Button blueBtn;
	
	//기본 생성자를 오버로딩
	public ButtonRedBlue(){
		redBtn = new Button("빨강");
		blueBtn = new Button("파랑");
		
		setLayout(new FlowLayout());
		
		//각각의 버튼에 액션리스너 등록
		redBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		
		add(redBtn);
		add(blueBtn);
		
		setTitle("빨간버튼 파란버튼!!");
		setSize(150, 150);
		setVisible(true);
		
		//프레임의 창닫기 버튼에 이벤트 처리
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
		//발생한 이벤트 소스를 객체에 저장
		Object obj = e.getSource();
		
		//확인해서 배경색 변경		
		if(obj == redBtn){//빨간 버튼이 눌렸는지 
			
		}else if(obj == blueBtn){ //파란 버튼이 눌렸는지
			
		}
	}

}












