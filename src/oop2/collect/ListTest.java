package oop2.collect;

import java.util.*;


public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//java.util.* 임포투
		//List 참조변수 list 생성
		
		//Set set = new Set();  -- 인터페이스라서 직접 참조객체를 생성할 수 없음. 그래서 set을 상속받은 자식 클래스 타입으로 객체를 생성.
		
		List list = new ArrayList();
		System.out.println("list의 크기 : " + list.size());
		
		list.add("하나");
		list.add(2);
		list.add(3.0);
		list.add('4');
		
		
		System.out.println(list);
		System.out.println("list의 크기 : " + list.size());
				// TODO Auto-generated method stub
		
		for (int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}