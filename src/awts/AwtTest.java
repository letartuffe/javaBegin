package awts;

import java.awt.*;
import java.awt.event.*;

public class AwtTest extends Frame {
	
	GridBagLayout gb;
	GridBagConstraints gbc;
	
	AwtTest(){
		
		setSize(400, 600);
		setVisible(true);
		setTitle("사원등록");
	
		gb = new GridBagLayout();
		setLayout(gb);
		
		gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH;
		
		CheckboxGroup group = new CheckboxGroup();
		
		addToFrame(new Label("성    명"), 0,0,1,1, 1.0 , 1.0);
		addToFrame(new TextField("222", 10), 1,0,1,1, 1.0 , 1.0);
		addToFrame(new Label("성   별"), 2,0,1,1, 1.0 , 1.0);
		addToFrame(new Checkbox("남자", group, true), 3,0,1,1, 0.5 , 1.0);
		addToFrame(new Checkbox("여자", group, false), 4,0,1,1, 0.5 , 1.0);
		
		addToFrame(new Label("주민등록번호"), 0,1,1,1, 1.0 , 1.0);
		addToFrame(new TextField("6"), 1,1,1,1, 1.0 , 1.0);
		addToFrame(new Label("-"), 2,1,1,1, 1.0 , 1.0);
		addToFrame(new TextField("8"), 3,1,2,1, 1.0 , 1.0);
		
		
		addToFrame(new Label("주소"), 0,2,1,1, 1.0 , 1.0);
		addToFrame(new TextField(""), 1,2,4,1, 1.0 , 1.0);
		Choice list1 ;
		addToFrame(new Label("부서명"), 0,3,1,1, 1.0 , 1.0);
		addToFrame(list1 = new Choice(), 1,3,4,1, 1.0 , 1.0);
		list1.addItem("기획부");
		list1.addItem("자재부");		
		
		addToFrame(new Label("취미"), 0,4,1,1, 1.0 , 1.0);
		addToFrame(new Checkbox("운동",true), 1,4,1,1, 1.0 , 1.0);
		addToFrame(new Checkbox("음악",false), 2,4,1,1, 1.0 , 1.0);
		addToFrame(new Checkbox("영화",false), 3,4,1,1, 1.0 , 1.0);
		
		
		
		addToFrame(new TextField("자기소개"), 0,5,5,1, 1.0 , 1.0);
		addToFrame(new TextArea("자기소개"), 0,6,5,1, 1.0 , 1.0);
		
		
		addToFrame(new Panel(), 0,7,1,1, 1.0 , 1.0);
		addToFrame(new Panel(), 1,7,1,1, 1.0 , 1.0);
		addToFrame(new Button("저장"), 2,7,1,1, 1.0 , 1.0);
		addToFrame(new Button("종료"), 3,7,1,1, 1.0 , 1.0);
		addToFrame(new Panel(), 4,7,1,1, 1.0 , 1.0);
		
		
		setBounds(200,200,400,600);
		
		
			
		//프레임의 창닫기 버튼에 이벤트 처리
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
