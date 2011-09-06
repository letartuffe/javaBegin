package oop2.collect;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, String> ht;
		
		ht = new Hashtable<String, String>();
		
		ht.put("G", "����");
		ht.put("S", "����");
		ht.put("A", "���");
		
		Enumeration e = ht.keys();
		while(e.hasMoreElements()){
			Object key = e.nextElement();
			Object value = ht.get(key);
			System.out.println(key 
					+ " : " + value);
		}
	}

}






