package oop2;

public class CellPoneMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제품번호는. aaa-100
		//전화번호 111-111-1111
		//60화음, 400만해상도 가지는
		//DicaPhone 객체 생성
		//
		//제품번호 bbb-200
		//전화번호 010-333-4444
		//30화음, 메모리용량 512
		//MP3Phone 객체 생성

		DicaPhone dica = new DicaPhone("aaa-100", "111-111-1111", 60, "400만");
		Mp3Phone mp3Phone = new Mp3Phone("bbb-100", "010-333-4444", 30, 512);
		
		//모델 화음 전화번호 출력
		System.out.println(dica.model+", "+dica.chord+", "+dica.number);
		System.out.println(mp3Phone.model+", "+mp3Phone.chord+", "+mp3Phone.number);
		
		//각 클래스의 getter를 이용하여 
		//모델 화음 전화번호 출력
		//CellPhone에서 작성된 get.. 메소드들 이용.

		System.out.println("DicaPhone 정보 : " + dica.getModel()+"  "  + dica.getChord()+"  "  + dica.getChord());
		System.out.println("DicaPhone 정보 : " + mp3Phone.getModel()+"  " + mp3Phone.getChord()+"  "  + mp3Phone.getChord());

	}

}
