package oop2.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ArrayList<String> a ;
		String[] s ;
		
		s = new String[] {"아침", "점심", "저녁"};
		a = new ArrayList<String>();
				
		for (int i =0; i < s.length ; i++){
			a.add(s[i]);
		}
				
		for (String temp : a){
			System.out.println(temp);
		}
		
		Iterator itr = a.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
