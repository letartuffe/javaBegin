package oop2.collect;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		//Vector�� �ν��Ͻ�(��ü) vec ����
		
		Vector<Integer> vec = new Vector<Integer>();
		
		//vec�� ũ�� �� �뷮 ���
		System.out.println(vec.size()+" "+vec.capacity());
		
		
		//Vector�� �ν��Ͻ� v ����
		//�ʱ� �뷮�� 5, �뷮 ������ 2�� �ǵ���..
		Vector<Integer> v = new Vector<Integer>(5, 2);
		
		for (int i = 0; i<6;i++){
			v.add(i*10);
			System.out.print(v.get(i)+" ");
		}
		
		System.out.println(v.size()+" "+v.capacity());
		
		System.out.println(v.firstElement()+" "+v.get(1));
		
		System.out.println(v);
		
		//v.removeElementAt(3);
		v.remove(3);
		System.out.println(v);
		
		
		
				
		
		
		

	}

}
