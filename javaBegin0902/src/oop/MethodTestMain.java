package oop;

public class MethodTestMain {

	public static void main(String[] args) {
//	메서드 호출 시에 넘겨주는 매개변수 : int형 원금(ex. 10000)
//	출력문 : 원금 10000원에 대한 이자는 1500원입니다.           
//		   (원 이하는 출력되지 않음)
		
		MethodTest m = new MethodTest();
		int wongum = 10000;
		char level = 'a';
		
		//원금만 매개변수로 받는 
		//interest 메서드 호출
		int eeja = m.interest(wongum);
		
		//원금과 고객 등급을 매개변수로 받는 
		//interest 메서드 호출
		eeja = m.interest(wongum, level);
		
		System.out.println(eeja);
	}

}
