package oop;

public class MethodTestMain {

	public static void main(String[] args) {
//	�޼��� ȣ�� �ÿ� �Ѱ��ִ� �Ű����� : int�� ����(ex. 10000)
//	��¹� : ���� 10000���� ���� ���ڴ� 1500���Դϴ�.           
//		   (�� ���ϴ� ��µ��� ����)
		
		MethodTest m = new MethodTest();
		int wongum = 10000;
		char level = 'a';
		
		//���ݸ� �Ű������� �޴� 
		//interest �޼��� ȣ��
		int eeja = m.interest(wongum);
		
		//���ݰ� �� ����� �Ű������� �޴� 
		//interest �޼��� ȣ��
		eeja = m.interest(wongum, level);
		
		System.out.println(eeja);
	}

}
