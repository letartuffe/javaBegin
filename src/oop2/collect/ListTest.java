package oop2.collect;

import java.util.*;


public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//java.util.* ������
		//List �������� list ����
		
		//Set set = new Set();  -- �������̽��� ���� ������ü�� ������ �� ����. �׷��� set�� ��ӹ��� �ڽ� Ŭ���� Ÿ������ ��ü�� ����.
		
		List list = new ArrayList();
		System.out.println("list�� ũ�� : " + list.size());
		
		list.add("�ϳ�");
		list.add(2);
		list.add(3.0);
		list.add('4');
		
		
		System.out.println(list);
		System.out.println("list�� ũ�� : " + list.size());
				// TODO Auto-generated method stub
		
		for (int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}