package oop;

public class MethodTest {
	//������ �Ѱ� �޾Ƽ�
	//���ڸ� ����ϰ�
	//���� ���ڸ� ��ȯ�ϴ� interest �޼���
	public int interest(int wongum){
		//������ 15% ���� ���
		int eeja = (int)(wongum * 0.15);
		return eeja;
	}
	
//	���� ��� �޼��� v.2
//	������ �����ϴ� �ν��Ͻ� ��� ���� rate ����	
//	���ݰ� �� ��� ������ �Ű������� �޾Ƽ� 
//	�� �����       �ʿ췮 ��(a)�̸� 30%		    	
//	�췮 ��(b)�̸� 20%		    	
//	�Ϲ� ��(c)�̸� 15%			
//	�ҷ� ��(d)�̸� 5%			
//	�� ���� ���� 0%�� ���ڸ� ����ϰ�
//	���� ���ڴ� �������� �����Ͽ� ��ȯ

	public int interest(int wongum, char level){
		double rate;
		
		//�� ��޿� ���� ���� ���
		switch(level){
		case 'a' : rate = 0.3; break;
		case 'b' : rate = 0.2; break;
		case 'c' : rate = 0.15; break;
		case 'd' : rate = 0.05; break;
		default  : rate = 0.0;
		}
		
		//������ 15% ���� ���
		int eeja = (int)(wongum * rate);
		return eeja;
	}
	
}
