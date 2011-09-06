package oop2.collect;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector의 인스턴스 vec 생성
		Vector<Integer> vec = new Vector<Integer>();
		
		//vec의 크기 및 용량 출력
		System.out.println(vec.size() + " : " 
						  + vec.capacity());
		
		System.out.println("==============");
		
		//Vector의 객체 v 생성
		//초기 용량은 5, 용량 증가는 2씩 되도록
		//적당한 생성자를 이용
		Vector v = new Vector(5, 2);

		//v의 크기 및 용량 출력
		System.out.println(v.size() + " : " 
						  + v.capacity());

		System.out.println("==============");
		//벡터 v에 0, 10, 20, 30, 40, 50 저장
		for(int i=0 ; i<6 ; i++){
			v.add(i * 10);
			System.out.print(v.get(i) + " ");
		} 

		System.out.println("\n==v의 크기 및 용량 출력==");
		//v의 크기 및 용량 출력
		System.out.println(v.size() + " : " 
				  + v.capacity());

		System.out.println("==v의 첫번째, 두번째 요소  출력==");
		//v의 첫번째, 두번째 요소  출력
		System.out.println(v.firstElement() 
				           + " : " + v.get(1));
		
		//v에서 30 지우기
		v.remove(3);
		
		for(int i=0 ; i<5 ; i++){
			System.out.print(v.get(i) + " ");
		} 
		
	}

}













