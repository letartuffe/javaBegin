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
		s = new String[] {"������", "������", "�۾���", "���Ƹ�"};
		
		for(int i = 0; i < s.length ; i++){
			v.add(s[i]);
		}
		//�ֱ� ��~~
		
		//
		Iterator it = v.iterator();
		
		//next�� ���������� ��� ���.
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}

}
