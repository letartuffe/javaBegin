package oop;

public class WrapperInt {

	public static void main(String[] args) {
		String num1 = "100";
		String num2 = "200";
		
		System.out.println(num1 + num2);

		System.out.println(Integer.parseInt(num1) 
						   + Integer.parseInt(num2));
		
		Integer aa = new Integer(num1);
		Integer bb = new Integer(num2);
		
		//언박싱 - 객체를 기본 자료형에 바로 대입
		int aaa = new Integer(num1);
		int bbb = new Integer(num2);
		
		//박싱 - 기본자료형을 객체형에 대입
		aa = 100000;
		bb = 200000;
	}

}
