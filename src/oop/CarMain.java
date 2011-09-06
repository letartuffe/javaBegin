package oop;

//기본 생성자 이용
//Car 클래서의 참조 변수  c1 생성
//기본 생성자 이용하여 흰색, 오토 타입의 문 3개 짜리 자동차 만들기.

public class CarMain {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "흰색";
		c1.gearType = "오토";
		c1.door = 3;
		
		//매개변수가 있는 생성자 이용
		//빨간 자동차 만들기
		
		Car c2 = new Car("빨간");
				
		//까만색의 수동기어, 문2개 짜리자동차만들기
		Car c3 = new Car("까만","수동",2);
		
		
	}
}
