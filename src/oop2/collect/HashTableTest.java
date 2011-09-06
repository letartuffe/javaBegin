package oop2.collect;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//���ڿ� �迭 ���� area�� �����ϸ鼭
		//���� ������ �ʱ�ȭ �Ͽ� ����
		//����, ����, ���빮, ����, Ȳ�е�
		
				
		//�ؽ����̺� ��ü ����
		Hashtable<String, String> table ;
		
		//�ؽ����̺� ��ü ����
		table = new Hashtable<String, String>();
		
		table.put("g", "����");
		table.put("s", "����");
		table.put("A", "���");
		
		Enumeration<String> e = table.keys();
		
		while(e.hasMoreElements()){
			Object key = e.nextElement();
			Object value = table.get(e);
			
			System.out.println(key +" "+ value);
		}
		
		
		System.out.println(table);
				
	}

}
