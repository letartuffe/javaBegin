package oop2.collect;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		//set 참조변수 set생성
		
		//Set set = new Set();  -- 인터페이스라서 직접 참조객체를 생성할 수 없음. 그래서 set을 상속받은 자식 클래스 타입으로 객체를 생성.
		
		//Set<String> set = new HashSet();  -- 문자열만 받을 수 있어서 오류남..그래서 최상위인 Object로 받으면 됨. 어떤 타입을 받을지 모르면 Object로 받으면 됨. 그러나 이러면.. 별의미없음.
		
		
		Set<Object> set = new HashSet();
		// = Set set = new HashSet();
		
		System.out.println("set의 크기 : " + set.size());
		
		set.add("하나");
		set.add(2);
		set.add(3.0);
		set.add('4');
		
		
		System.out.println(set);
		System.out.println("set의 크기 : " + set.size());
		
	}	
	
	

}
