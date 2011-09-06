package oop;

public class MethodTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//원금 만원
		//이자
		int interest = 0;
		
		
		//메소드 호출위한 인스턴스 생성
		
		
		//메소드 호출
		//MethodTest.java 에서 만든 이자계산 메소드에 base (10000)을
		//매게변수로 보내서 계산.. 결과..리턴한 결과값을 
		//int interest에 저장.
		
		
		MethodTest m = new MethodTest() ;
		interest = m.interest(10000, 'a');
		
		System.out.println("원금 " + 10000 + "에 대한 이자는 \n" + interest + "입니다.");
	}
}
