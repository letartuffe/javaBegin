package oop2.collect;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList ��ü a ����
		ArrayList<String> a;
		
//		���ڿ� �迭 s ����
		String[] s;
		
//		s�� ����ħ, ����, ���ᡱ�� �־� ��ü ����
		s = new String[] {"��ħ", "����", "����"};
		
//		a�� ����
		a = new ArrayList<String>();
		
				
//		�ݺ����� �̿��Ͽ�
//		s�� ��� �ִ� ���� ArrayList�� ���
		for(int i=0 ; i<s.length ; i++){
			a.add(s[i]);
		}
		
//		ArrayList�� ���� ���
		for(String temp : a){
			System.out.println(temp);
		}

		System.out.println("Iterator�� �̿��Ͽ� ArrayList�� �� ���");
		
		Iterator itr = a.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
















