package oop2;

public class Mp3Phone extends CellPhone {

	//저장할 용량을 저장할 변수 size 선언
	//	
	//	모델명,전화번호 , 화음, 저장용량을 
	//	매개변수로 받아서 초기화 하는 생성자.
	
	int size ;
	public Mp3Phone(String model, String number, int chord, int size) {
		this.model = model;
		this.number = number ;
		this.chord = chord;
		this.size = size;
	}
	
	//내가 그냥 만든거 -  출력하는 메소드
	public void getMp3Phone(){
		System.out.println(model +", "+chord+", "+number);
	}
	


	
}
