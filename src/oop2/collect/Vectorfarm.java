package oop2.collect;

import java.util.Iterator;
import java.util.Vector;

public class Vectorfarm {
	
	static void printMsg(Vector o){
		
		System.out.println("���� ũ��� : "+o.size());
		System.out.println("���� �뷮�� : "+o.capacity());
	}

	public static void main(String[] args) {
		
		Vector zoo1 = null; 
		
		String[] ani ;
		
		zoo1 = new Vector(3, 4);
		
		ani = new String[] {"������", "�۾���", "������", "���Ƹ�"};
			
		//vec�� ũ�� �� �뷮 ���
		System.out.println("���� �ʱ� ũ��� : "+zoo1.size());
		System.out.println("���� �ʱ� �뷮�� : "+zoo1.capacity());
		System.out.println("============================");
		
		//�ֵ� �ֱ�
		for(int i = 0; i < ani.length ; i++){
			zoo1.add(ani[i]);
			System.out.print(ani[i]);
		}
		
		System.out.println();
		//vec�� ũ�� �� �뷮 ���
		printMsg(zoo1);
		
		//
		Iterator it = zoo1.iterator();
		
		System.out.println("������ ���");
		//next�� ���������� ��� ���.
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//������ ��������
		zoo1.remove(2);
		System.out.println("���� �����ִ� ��������?");
		
		//�����ִ� ���� ���
		//next�� ���������� ��� ���.
		Iterator it2 = zoo1.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		//vec�� ũ�� �� �뷮 ���
		printMsg(zoo1);
		System.out.println("============================");
		
		//���� ������ ���ڸ�ŭ ���� ũ�� ����
		zoo1.trimToSize();

		printMsg(zoo1);
	}
}
