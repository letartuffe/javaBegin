package oop2.collect;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//문자열 배열 변수 area를 선언하면서
		//다음 값으로 초기화 하여 생성
		//서울, 종로, 동대문, 동묘, 황학동
		
				
		//해쉬테이블 객체 선언
		Hashtable<String, String> table ;
		
		//해쉬테이블 객체 생성
		table = new Hashtable<String, String>();
		
		table.put("g", "포도");
		table.put("s", "딸기");
		table.put("A", "사과");
		
		Enumeration<String> e = table.keys();
		
		while(e.hasMoreElements()){
			Object key = e.nextElement();
			Object value = table.get(e);
			
			System.out.println(key +" "+ value);
		}
		
		
		System.out.println(table);
				
	}

}
