package oop;

public class StaticVar {
	char level;
	static int count;
	
	public static void main(String[] args) {
//		level�� static�� �ƴ϶� 
//		�̷��� �� ���� �Ұ�
//		level = 'a';	
					
//		�׷��� ���������� �ʿ�
		StaticVar s = new StaticVar();
		s.level = 'a';
		
		count = 100;
	}

}
