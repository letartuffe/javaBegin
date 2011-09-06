package oop2.collect;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڿ� �迭 ���� area�� �����ϸ鼭
		//���� ������ �ʱ�ȭ �Ͽ� ����
		//����, ����, ���빮, ����, Ȳ�е�
		
		String[] area = {"����", "����", "���빮", "����", "Ȳ�е�"};
		//hashmap �� key 0,1,2,3,..��
		
		//�ؽ��� ��ü ����
		HashMap<Integer, String> map ;
		
		//�ؽ��� ����
		map = new HashMap<Integer, String>();
		
		//�ʿ� �迭�� �� ����
		for(int i = 0 ; i < area.length ; i++){
			map.put(i, area[i]);
		}
		
		//keySet() �̿��Ͽ� map�� ����ִ� Ű�� Set ��ü�� ���
		
		Set<Integer> keys = map.keySet() ;
		
		//�ʿ��� �� �о����
		for(Integer temp : keys){
			System.out.println(map.get(temp));
		}
		
		System.out.println(map);
		
	}

}
