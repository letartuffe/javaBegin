package oop2;

import basic.Gugudan;

public class GuguTest {

	public static void main(String[] args) {
//		 1. Gugudan 클래스의 객체 생성
		 Gugudan g = new Gugudan();
		 
//		 2. 정수형 변수에 Gugudan 
//		         클래스 객체의 해쉬코드 저장
		 int hashcode = g.hashCode(); 
				 
//		 3. 위의 해쉬코드 출력
		 System.out.println(hashcode);
		 
//		 4. Gugudan 클래스 객체 출력
		 System.out.println(g);
	}

}
