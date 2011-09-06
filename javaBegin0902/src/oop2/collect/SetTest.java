package oop2.collect;

import java.util.*;

public class SetTest {
	public static void main(String[] args) {
		//Set 참조 변수 set 생성
		//Set은 인터페이스라서 직접 참조 객체를 
		//생성할 수 없음.
//		Set set = new Set();
		
		//그래서 Set을 상속받은 자식 클래스 타입으로
		//객체를 생성
		Set set = new HashSet();
		System.out.println("set의 크기 :" + set.size());
		set.add("하나");
		set.add(2);
		set.add(3.0);
		set.add('4');
		System.out.println(set);
		System.out.println("set의 크기 :" + set.size());
		
	}

}
