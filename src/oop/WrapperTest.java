package oop;

public class WrapperTest {
	public static void main(String[] args) {
		
		//���ڿ��� ���ڷ� �ٲ㼭 ���
		String a = "100";
		String b = "200";
		
		//���ڿ� ����
		System.out.println(a+b); 
		
		//���ڿ��� int�� ��ȯ �Ͽ� ���
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b)) ;
		
		Integer int1 = new Integer(a);
		Integer int2 = new Integer(b);
		
		//��ڽ�  - ��ü�� �⺻�ڷ����� �ٷ� ����
		int int11 = new Integer(a);
		int int22 = new Integer(b);
		
		//�ڽ� - �⺻�ڷ����� ��ü���� ����
		int1 = 200000;
		int2 = 300000;
		
		
	}

}
