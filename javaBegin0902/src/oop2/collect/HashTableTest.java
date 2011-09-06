package oop2.collect;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, String> ht;
		
		ht = new Hashtable<String, String>();
		
		ht.put("G", "포도");
		ht.put("S", "딸기");
		ht.put("A", "사과");
		
		Enumeration e = ht.keys();
		while(e.hasMoreElements()){
			Object key = e.nextElement();
			Object value = ht.get(key);
			System.out.println(key 
					+ " : " + value);
		}
	}

}






