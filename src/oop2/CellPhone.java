package oop2;

public class CellPhone {
	
	//속성, 프로퍼티
	//모델명 전화 번호 화음
	String model;
	String number;
	int chord;
	
	//전화번호를 설정하는 setter
	public void setNumber(String number){
		this.number = number;
	}
	
	//모델명, 전화번호, 화음을 반환하는 getter 작성
	public String getModel(){
		return model;
	}
	public String getNumber(){
		return number;
	}
	public int getChord(){
		return chord;
	}
	
}
