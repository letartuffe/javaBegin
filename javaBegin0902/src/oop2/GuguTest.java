package oop2;

import basic.Gugudan;

public class GuguTest {

	public static void main(String[] args) {
//		 1. Gugudan Ŭ������ ��ü ����
		 Gugudan g = new Gugudan();
		 
//		 2. ������ ������ Gugudan 
//		         Ŭ���� ��ü�� �ؽ��ڵ� ����
		 int hashcode = g.hashCode(); 
				 
//		 3. ���� �ؽ��ڵ� ���
		 System.out.println(hashcode);
		 
//		 4. Gugudan Ŭ���� ��ü ���
		 System.out.println(g);
	}

}
