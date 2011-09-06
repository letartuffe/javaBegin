package oop2;

public class DicaPhone extends CellPhone{
	String pixel;

	
	//모델명, 전화번호, 화음, 해상도를 
	//매개변수로 받아서 초기화하는 생성자 작성
	public DicaPhone(String model,
					 String number,
					 int chord,
					 String pixel) {
		this.model = model;
		this.number = number;
		this.chord = chord;
		this.pixel = pixel;
	}

}
