package oop2.collect;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//문자열 배열 변수 area를 선언하면서 
		//다음의 값으로 초기화 하여 생성
		//서울, 종로, 동대문, 동묘, 황학동
		String[] area = {"서울", "종로", "동대문", "동묘", "황학동"};
		
		//해쉬맵 객체 선언
		HashMap<Integer, String> map;
		
		//해쉬맵 생성
		map = new HashMap<Integer, String>();
		
		for(int i=0 ; i<area.length ; i++){
			//맵에 배열의 값 저장
			map.put(i, area[i]);
		}
		
		
		//keySet 메서드를 이용하여 map에 들어 있는 키들을
		//Set 객체에 담기
		Set<Integer> keys = map.keySet();
		
		//맵에서 값 읽어오기
		for(Integer temp : keys){
			System.out.println(map.get(temp));
		}
	}

}












