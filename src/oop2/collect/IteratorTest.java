package oop2.collect;

import java.util.Iterator;
import java.util.Vector;

public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v;
		String[] s;
		
		v = new Vector(5, 5);
		s = new String[] {"강아지", "망아지", "송아지", "병아리"};
		
		for(int i = 0; i < s.length ; i++){
			v.add(s[i]);
		}
		//넣기 끝~~
		
		//
		Iterator it = v.iterator();
		
		//next가 없을때까지 계속 출력.
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}

}
