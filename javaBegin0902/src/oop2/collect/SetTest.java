package oop2.collect;

import java.util.*;

public class SetTest {
	public static void main(String[] args) {
		//Set ���� ���� set ����
		//Set�� �������̽��� ���� ���� ��ü�� 
		//������ �� ����.
//		Set set = new Set();
		
		//�׷��� Set�� ��ӹ��� �ڽ� Ŭ���� Ÿ������
		//��ü�� ����
		Set set = new HashSet();
		System.out.println("set�� ũ�� :" + set.size());
		set.add("�ϳ�");
		set.add(2);
		set.add(3.0);
		set.add('4');
		System.out.println(set);
		System.out.println("set�� ũ�� :" + set.size());
		
	}

}
