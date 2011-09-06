package oop2.collect;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//���ڿ� �迭 ���� area�� �����ϸ鼭 
		//������ ������ �ʱ�ȭ �Ͽ� ����
		//����, ����, ���빮, ����, Ȳ�е�
		String[] area = {"����", "����", "���빮", "����", "Ȳ�е�"};
		
		//�ؽ��� ��ü ����
		HashMap<Integer, String> map;
		
		//�ؽ��� ����
		map = new HashMap<Integer, String>();
		
		for(int i=0 ; i<area.length ; i++){
			//�ʿ� �迭�� �� ����
			map.put(i, area[i]);
		}
		
		
		//keySet �޼��带 �̿��Ͽ� map�� ��� �ִ� Ű����
		//Set ��ü�� ���
		Set<Integer> keys = map.keySet();
		
		//�ʿ��� �� �о����
		for(Integer temp : keys){
			System.out.println(map.get(temp));
		}
	}

}












