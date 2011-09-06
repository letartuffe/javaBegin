package oop;

public class CarMain {

	public static void main(String[] args) {
		//Car 클래스의 참조 변수 c1 생성
		Car c1 = new Car();
		
		//기본 생성자 이용하여 
		// 흰색, 오토 타입의
		// 문 3개짜리 자동차 만들기
		c1.color = "흰색";
		c1.gearType = "오토";
		c1.door = 3;
		
		// 매개변수가 있는 생성자 이용
		// 빨간 자동차 만들기
		Car c2 = new Car("빨강");
		
		// 까만색의 수동기어,문 2개짜리 
		// 자동차 만들기 
		Car c3 = new Car("까망", "수동", 2);
		
		
	}

}
