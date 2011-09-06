package oop2.collect;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 배열 변수 area를 선언하면서
		//다음 값으로 초기화 하여 생성
		//서울, 종로, 동대문, 동묘, 황학동
		
		String[] area = {"서울", "종로", "동대문", "동묘", "황학동"};
		//hashmap 에 key 0,1,2,3,..로
		
		//해쉬맵 객체 선언
		HashMap<Integer, String> map ;
		
		//해쉬맵 생성
		map = new HashMap<Integer, String>();
		
		//맵에 배열의 값 저장
		for(int i = 0 ; i < area.length ; i++){
			map.put(i, area[i]);
		}
		
		//keySet() 이용하여 map에 들어있는 키를 Set 객체에 담기
		
		Set<Integer> keys = map.keySet() ;
		
		//맵에서 값 읽어오기
		for(Integer temp : keys){
			System.out.println(map.get(temp));
		}
		
		System.out.println(map);
		
	}

}
