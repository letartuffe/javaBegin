package oop;

public class MP3p {
//	클래스명 : MP3p
//	속성 : 색상을 기억하는 color         
//	             메모리 용량을 기억하는 memory
//	동작 : memory용량을 upgrade해주는 memoryUp         
//	      color를 설정하는 setColor
	
	private String color;
	int memory;
	static String maker;
	
//	동작 : memory용량을 upgrade해주는 memoryUp   
	public void memoryUp(int n){
		memory += n;
		System.out.println("메모리 용량 업그레이드 완료!");
	}
	
//	color를 설정하는 setColor
	public void  setColor(String c){
		color = c;
		System.out.println("색상 변경 완료!");
	}


}
