package oop;

public class CountCons {
	
	//static�� �� ���̸� �ν��Ͻ� ���� 1,1,1, �̷��� ����. 
	//new ������ ��ü�� ������ count���� ������ �ִ°���
	//��ü�� �����ҷ��� static�� �ٿ����.
	static int count  ;


	public CountCons() {
		count++;
		//count = count + 1;
		System.out.println("���� ������ �ν��Ͻ��� : " + count);
	}
	
}
