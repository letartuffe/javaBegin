/**
 * 
 * @author �����
 * ���� ��¥ : 2011. 8. 18. �����
 * ���� ���� : �ڹ� �⺻ ����
 */

public class TestClass {
	
	static int total;
	
	public static void main(String[] args){
		int math;
		int eng;
		
		math = 90;
		eng = 100;
		
		int kor = 75;
		double avg;
		String gyulgwa;
		
		total = math + eng;
		
		total = total + kor;
		//total += kor;
		
		avg = total/3;
		
		//���� �����ڸ� �̿��Ͽ� ��� ����
		//���� : ������ 200�� �̻��̸� �հ�
		//      ������ 200�� �̸��̸� ���հ�
		gyulgwa = total>=200 ? "�հ�" : "���հ�";
		
		
		System.out.print("math : ");
		System.out.println(math);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + kor);
		System.out.println("===============");
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		System.out.println("===============");
		System.out.println("��� : " + gyulgwa); 
		
		
		

		System.out.println();
		System.out.println();
		
		
		
		
		
		
		System.out.println();
		boolean result;
		result = kor == eng;
		System.out.println(result);
		result = kor != eng;
		System.out.println(result);
		
		//���� ������ 90�� �̻��̰�
		//���� ������ 90�� �̻����� ���� �����
		//result�� �����ϰ� ��� ���
		result = (kor>=90) && (eng>=90);
		System.out.println(result);

		result = (kor>=90) || (eng>=90);
		System.out.println(result);

		System.out.println("==���ڿ� �� ==");
		//���ڿ� ���� id�� �����Ͽ� admin�� ����
		String id = "admin";
		
		//���ڿ� ���� input�� �����Ͽ� guest�� ����
		String input = "guest";
		
		//id�� input�� ������ ���� ����� 
		result = id.equals(input);
				
		//result�� �����ϰ� ���
		System.out.println(result);
		System.out.println(!result);

		System.out.println("==��Ʈ ������ ==");
//		������ ���� a�� �����ϸ鼭 10���� �ʱ�ȭ
		int a = 10;
		
//		������ ���� b�� �����ϸ鼭 7�� �ʱ�ȭ
		int b = 7;
		
//		������ ���� c�� �����ϸ鼭
//		a�� b�� & ������ ����� ����
		int c = a & b;
		
//		c�� ���� ���
		System.out.println(c);
		

		System.out.println("==���� ������ ==");
		// String id = "admin";
		//id�� "admin"�̸� ����� "������" ����
		//    �׷��� ������ "�Ϲ� �����" ����
		
		gyulgwa = id.equals("admin") 
				  ? "������" : "�Ϲ� �����";
		
		//��� �� ���
	}
	

	
}














class TestA{}
class TestB{}
