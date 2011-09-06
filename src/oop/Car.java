package oop;

public class Car {
	String color;
	String gearType;
	int door;

	
	//	에러대응
	//	
	//	색상만 매개변수로 받는 생성자 작성
	//	
	//	색상 기어타입 문의 개수를 매개변수로 받아서 
	// 각각 맴버 변수를 초기화 하는 생성자 작성
	
	//	에러대응
	public Car() {
	}
	
	//색상만 매개변수로 받는 생성자 작성	
	public Car(String color) {
		this.color = color;
	}
	//	색상 기어타입 문의 개수를 매개변수로 받아서 
	// 각각 맴버 변수를 초기화 하는 생성자 작성	
	public Car(String color, String gearType, int door) {
		//this.color = color;
		//색상을 매개변수로 받는 생성자 호출.
		this(color);
		this.gearType = gearType;
		this.door = door;
	}
	

	
	
}
