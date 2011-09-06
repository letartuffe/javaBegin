package oop;

public class Car {
	String color;
	String gearType;
	int door;

	// 기본 생성자 에러 대응
	public Car(){}
	
	
	// 색상을 매개변수로 받아서
	// color를 초기화하는 생성자 작성
	public Car(String color){
		this.color = color;
	}

	// 색상, 기어타입, 문의 개수를 
	// 매개 변수로 받아서
	// 각각 멤버 변수를 초기화하는 
	// 생성자 작성	
	public Car(String color, String gearType, int door) {
		//this.color = color;
		//색상을 매개변수로 받는 생성자 호출
		this(color);
		
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	
	
	

}
