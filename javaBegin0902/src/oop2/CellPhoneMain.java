package oop2;

public class CellPhoneMain {

	public static void main(String[] args) {
		//제품번호는 aaa-100,
		//전화번호는 010-1111-2222,
		//60화음, 400만 해상도를 가지는
		//DicaPhone 객체 생성
		DicaPhone d = new DicaPhone("aaa-100", 
									"010-1111-2222", 
								    60, "400");		
		
		//제품번호는 bbb-200,
		//전화번호는 010-3333-4444,
		//30화음, 메모리용량은 512짜리
		//MP3Phone 객체 생성
		MP3Phone p = new MP3Phone("bbb-200", 
								  "010-3333-4444",
								  30, 512);		
		
		//각 클래스의 getter를 이용하여 
		//DicaPhone 객체의 모델, 화음, 전화번호를 출력
		System.out.println("DicaPhone info : " 
							+ d.getModel() + " "
							+ d.getChord() + " "
							+ d.getNumber());
		//MP3Phone 객체의 모델, 화음, 전화번호를 출력
		System.out.println("MP3Phone info : " 
							+ p.getModel() + " "
							+ p.getChord() + " "
							+ p.getNumber());
		
	}

}
