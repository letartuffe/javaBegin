public class Homework1 {

	public static void main(String[] args) {
		//1�� -----------------
		int a1 = 10;
		int b1 = 7 ;
		
		System.out.println(a1^b1);
		
		//2�� ----------------------------------------
		System.out.println("======================");
		int a2 = 10;
		int b2 = 20;
		System.out.println(++a2);
			//1�� ���ϴ� ������ �����ϰ� ����ϹǷ� 11�� ���
		System.out.println(++a2 + b2++);
			//�տ��� 11�� �� a2�� 1�� ���ϴ� ���� ���� -- a2 + 1 = 12
			//�������ϴ� ���� ����                     -- a2 + b2 = 12 +20 =32 
			//b2�� 1�� ���ϴ� �������                 -- b2 = 21 
		System.out.println((++a2%3) + (a2*++b2) );
			//�տ��� 12���� a2�� 1�� ���ϴ� ����	-- a2 + 1 = 12 + 1 =13
			//3���� ������ ���� ���ϴ� ����     	-- 13%3 =1
			//a2�� 21�� �� b2�� ���ϴ� ����       	-- 13*22 = 286
			//���� ����   							-- 286+1 = 287

		//3��----------------------------------------
		System.out.println("======================");
		int a3, b3;
		a3 = b3 = 10;
		
		boolean c3 = ++a3 > b3++ || a3++ >= ++b3 ;
			// a3+1 ����  	-- a3 = a3+1 = 10 + 1 = 11
			// > ����  		-- ��� true (11>10) 
			// b3+1 ����	-- b3 = b3+1 = 10 + 1 = 11
			// ���̾����Ƿ� ���� ����
		
		System.out.println(a3+", "+b3);
		System.out.println("���� c3�� �� : " +c3);
		System.out.println("======================");
		
		//ppt
		//OP_if.java
		//������ ���� mod ����, ���ǰ� �ʱ�ȭ
		// ���ǻ��׿����� �̿�
		//Ȧ���� �Է��Ͻ� ���ڴ� Ȧ�� �Դϴ�.
		//¦���� �Է��Ͻ� ���ڴ� ¦�� �Դϴ�. 
		//���

		int mod = 235;
		String test;
		
		test = mod%2 == 0 ? "Ȧ":"¦";
		System.out.printf("�Է��Ͻ� ���ڴ� %s���Դϴ�\n",test);
		
		System.out.println("======================");
		//10�� 10.0f�� ����
		//'0'�� 0�� ����
		//'A'�� 65�� �ٸ���
		
		boolean bool;
		
		int iten = 10;
		float itenf = 10f;
				
		bool = iten == itenf ? true : false ;
		System.out.println("10�� 10.0f�� ����:"+bool);
		
		int szero = 0;
		char czero = '0';
		
		bool = szero == czero ? true : false ;
		System.out.println("\'0\'�� 0�� ����:" + bool);
		
		int ia = 65;
		char a = 'A';
		
		bool =ia == a ? true : false ;
		System.out.println("\'A\'�� 65�� ����:"+bool);
		

		System.out.println("======================");
		//OP_Logicical.java
		//������ ���� x ���� ������ ������ ����
		// ���ǻ��׿����� �̿��Ͽ� x�� ���� �빮������ �ҹ������� ���ϰ� ��� ���
		
		
		char x = 'A';
		String bigorsmall;
		
		bigorsmall = (x >= 65 && x <= 90) ? "��":"��";
		System.out.printf("�Է��ϽŹ��ڴ� %s�����Դϴ�.\n", bigorsmall);

		System.out.println("======================");
		
		//CharToCode.java
		//���� ������ �ƽ�Ű�ڵ尪�� 10������ ���
		//����������ȯ ������ -> ������
		char ascText = 'A';
		System.out.println("���� \""+ascText+"\"�� �ƽ�Ű�ڵ尪 : "+(int)a);

		System.out.println("======================");
		//CodeToChar.java
		//������ 10������ �ƽ�Ű�ڵ尪�� �ش��ϴ� ���ڸ� ���
		//����� ����ȯ  ������ --> ������
		int asc = 65;
		System.out.println("�ƽ�Ű�ڵ尪 \""+asc+"\"�� ���� : "+(char)asc);
				
	}

}
