package oop;

public class MethodTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ����
		//����
		int interest = 0;
		
		
		//�޼ҵ� ȣ������ �ν��Ͻ� ����
		
		
		//�޼ҵ� ȣ��
		//MethodTest.java ���� ���� ���ڰ�� �޼ҵ忡 base (10000)��
		//�ŰԺ����� ������ ���.. ���..������ ������� 
		//int interest�� ����.
		
		
		MethodTest m = new MethodTest() ;
		interest = m.interest(10000, 'a');
		
		System.out.println("���� " + 10000 + "�� ���� ���ڴ� \n" + interest + "�Դϴ�.");
	}
}
