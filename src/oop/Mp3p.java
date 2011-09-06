//클래스명 Mp3p
//속성 : 색상을 기억하는 color
//		메모리 용량을 기억하는 memory
//
//동작 : memory 용량을 업그레이드해주는 memoryUp
//		color를 설정하는 setColor

package oop;

public class Mp3p {
	
	private String color;	//인스턴스 변수
	int memory;		//인스턴스 변수
	//static 변수는 객체가 생성시 생성되면, 단 하나만 생성
	//모두가 공유하는 변수. 
	//객체를 생성하지 않아도 사용가능.
	//특정 객체에서 값을 수정하면 다른 객체들이 수정된 값을 사용
	
	static String maker;	//스태틱 변수
	
	
	public void memoryUp(int n){
		memory +=n ;
		System.out.println("메모리 용량 업그레이드 완성");
	}
	
	public void setColor(String c){
		color = c;
		System.out.println("색상변경");
				
	}	
}
