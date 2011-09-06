package oop2;

public class MP3Phone extends CellPhone {
	// 저장 용량을 저장할 변수 size 선언
	int size;

	// 모델명, 전화번호, 화음, 저장용량을
	// 매개변수로 받아서 초기화하는 생성자 작성
	public MP3Phone(String model, 
					String number, 
					int chord, 
					int size) {
		this.model = model;
		this.number = number;
		this.chord = chord;
		this.size = size;
	}
}
