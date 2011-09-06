package oop2.collect;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector�� �ν��Ͻ� vec ����
		Vector<Integer> vec = new Vector<Integer>();
		
		//vec�� ũ�� �� �뷮 ���
		System.out.println(vec.size() + " : " 
						  + vec.capacity());
		
		System.out.println("==============");
		
		//Vector�� ��ü v ����
		//�ʱ� �뷮�� 5, �뷮 ������ 2�� �ǵ���
		//������ �����ڸ� �̿�
		Vector v = new Vector(5, 2);

		//v�� ũ�� �� �뷮 ���
		System.out.println(v.size() + " : " 
						  + v.capacity());

		System.out.println("==============");
		//���� v�� 0, 10, 20, 30, 40, 50 ����
		for(int i=0 ; i<6 ; i++){
			v.add(i * 10);
			System.out.print(v.get(i) + " ");
		} 

		System.out.println("\n==v�� ũ�� �� �뷮 ���==");
		//v�� ũ�� �� �뷮 ���
		System.out.println(v.size() + " : " 
				  + v.capacity());

		System.out.println("==v�� ù��°, �ι�° ���  ���==");
		//v�� ù��°, �ι�° ���  ���
		System.out.println(v.firstElement() 
				           + " : " + v.get(1));
		
		//v���� 30 �����
		v.remove(3);
		
		for(int i=0 ; i<5 ; i++){
			System.out.print(v.get(i) + " ");
		} 
		
	}

}













