package oop;

public class Mp3pMain {
	public static void main(String[] args){
		
		Mp3p mp3;			//MP3p 클래스의 참조 객체 선언
		mp3 = new Mp3p(); 	//MP3p 클래스의 참조 객체 생성
		
		//메모리 용량을 늘리는 호출
		mp3.memoryUp(1000);
		
		//mp3의 색은 노란색, 용량은 4000, 삼성 제조
		//인스턴스 변수
		//mp3.color = "노랑";  >> private 으로 변경 사용불가.
		
		mp3.memory = 4000 ; 
		
		//스태틱(클래스) 변수     
		Mp3p.maker = "삼성";
		
		//setColor 사용
		//mp3 색을 바꾸는 메소드 호출   
		mp3.setColor("노랑");
		
	}
}
