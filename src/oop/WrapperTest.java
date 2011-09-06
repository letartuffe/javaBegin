package oop;

public class WrapperTest {
	public static void main(String[] args) {
		
		//문자열을 숫자로 바꿔서 계산
		String a = "100";
		String b = "200";
		
		//문자열 결함
		System.out.println(a+b); 
		
		//문자열을 int로 변환 하여 계산
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b)) ;
		
		Integer int1 = new Integer(a);
		Integer int2 = new Integer(b);
		
		//언박싱  - 객체를 기본자료형에 바로 대입
		int int11 = new Integer(a);
		int int22 = new Integer(b);
		
		//박싱 - 기본자료형을 객체형에 대입
		int1 = 200000;
		int2 = 300000;
		
		
	}

}
