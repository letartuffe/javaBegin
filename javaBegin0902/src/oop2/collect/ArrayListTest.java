package oop2.collect;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList 객체 a 선언
		ArrayList<String> a;
		
//		문자열 배열 s 선언
		String[] s;
		
//		s에 “아침, 점심, 저녁”을 넣어 객체 생성
		s = new String[] {"아침", "점심", "저녁"};
		
//		a를 생성
		a = new ArrayList<String>();
		
				
//		반복문을 이용하여
//		s에 들어 있는 값을 ArrayList에 담기
		for(int i=0 ; i<s.length ; i++){
			a.add(s[i]);
		}
		
//		ArrayList의 값을 출력
		for(String temp : a){
			System.out.println(temp);
		}

		System.out.println("Iterator를 이용하여 ArrayList의 값 출력");
		
		Iterator itr = a.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
















