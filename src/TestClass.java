/* Ŭ���� 3�� ����� ����
 *	TestClass.java
 *	2011.8.17
 *	������
 */

public class TestClass {
	
	static int total; //�ɹ����� ��������.
	static double avg;
	
	public static void main(String[] args){
		
		int math;
		int eng;
		int kor;
		String rufrhk ;
		
		math = 90;
		eng = 20;
		kor = 75;
		
		total = math+eng+kor;
		avg =  total / 3;
		System.out.print("���� : ");
		System.out.println(math);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + kor);		
		System.out.println("==============================");
		System.out.println("���� : " + total);		
		System.out.println("==============================");
		System.out.println("��� : " + avg);		
		
		
		System.out.println("-------------------------");
		
		
		//���ڿ� ���� id�� �����Ͽ� admin�� ����
		//���ڿ� ���� input�� �����Ͽ� guest�� ����
		//id�� input�� ������ ���� ����� result�� �����ϰ� ���.		
		
		String id = "admin";
		String input = "guest";
		boolean result;
		
		result = id == input;
		System.out.println(result);
		result = id.equals(input);  
		System.out.println(result);
		
		
		//id�� admin�̸� ����� ������ �׷��� ������ �Ϲݻ���� ����
		System.out.println("======���� ������==================");
		rufrhk = id.equals("admin") ? "������" : "�Ϲݻ����" ;
		System.out.println(rufrhk);
		
		
		
		
		//! 
		System.out.println("==   !    ====================");
		System.out.println(!result);
		System.out.println("==============================");
		//���ǿ����ڸ� �̿��Ͽ� ��� ����
		//���� : ������ 200�� �̻��̸� �հ�
		//						�̸��̸� ���հ�
		
		//total >= 200 ? "�հ�" : "���հ�";  
		//�������� �������ϱ� �����ϸ� �������.
		
		rufrhk = total >= 200 ? "�հ�" : "���հ�";
		System.out.println(rufrhk);
		
		
	}
	
	class TestA{}
}



class TestB{}