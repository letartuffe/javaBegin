package oop2.collect;

//1. java.util ��Ű�� ����Ʈ
import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		//2.List �������̽��� ���� ���� list ����
		//  (���� : List�� ��ӹ޴� ArrayList Ȱ��)
		List list = new ArrayList();		
		
		//3.list�� "�ϳ�", 2, 3.0, '4'�� ����
		list.add("�ϳ�");
		list.add(2);
		list.add(3.0);
		list.add('4');
		
		//4. list�� ũ�� ���
		System.out.println(list.size());
		
		//5. list�� ��Ҹ� ���
		System.out.println(list);
		
		System.out.println("=============");
		//for���� �̿��Ͽ� list�� ��� ���
		for(int i=0 ; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
		
	}

}













