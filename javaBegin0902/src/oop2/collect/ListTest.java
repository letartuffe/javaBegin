package oop2.collect;

//1. java.util 패키지 임포트
import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		//2.List 인터페이스의 참조 변수 list 생성
		//  (참고 : List를 상속받는 ArrayList 활용)
		List list = new ArrayList();		
		
		//3.list에 "하나", 2, 3.0, '4'를 저장
		list.add("하나");
		list.add(2);
		list.add(3.0);
		list.add('4');
		
		//4. list의 크기 출력
		System.out.println(list.size());
		
		//5. list의 요소를 출력
		System.out.println(list);
		
		System.out.println("=============");
		//for문을 이용하여 list의 요소 출력
		for(int i=0 ; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
		
	}

}













