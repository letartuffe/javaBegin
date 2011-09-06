package oop;

public class MP3pMain {

	public static void main(String[] args) {
		MP3p mp3;			//MP3p 클래스의 참조 객체 선언
			
		mp3 = new MP3p();	//참조 객체 생성
		
		// 선언과 생성을 동시에 
		// ==> MP3p mp3 = new MP3p();
		
		//메모리 용량을 늘리는 메서드 호출
		mp3.memoryUp(1000);
		
		//mp3의 색은 노란색, 용량은 4000, 삼성 제조
		
		//인스턴스 변수
//		mp3.color = "노랑";
		
		//MP3 색을 바꾸는 메서드 호출
		mp3.setColor("노랑");
		
		mp3.memory = 4000;
		
		//스태틱(클래스) 변수
		MP3p.maker = "삼성";
		
	}

}













