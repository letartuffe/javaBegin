
public class PrimitiveType {

	public static void main(String[] args) {
		
		int i1 = 2147483647;
		int i2 = 1;
		long i3 = i1 + i2;
		System.out.println(i3);
		
		
		System.out.println("===== ������ =====");
		int c = 100;
		long d = 20000000000L;
		byte e = 127;
		

		System.out.println("===== �Ǽ��� =====");
		float f = 3.14f;
		double g = 3.14;
		

		System.out.println("===== �Ǽ��� ��� =====");
		final double PI = 3.14;
		// PI = 3.1429587308174780; 
		// ����� �� ���� �Ұ���
		
		System.out.println("===== char =====");
		char first = 'A';
		char second = '\u0041';
		char third = 65;
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

		System.out.println("- escape sequence -");
		System.out.println("\"A\"");
		System.out.println("B\tC\nD");
		
		
		//���� j�� �����Ͽ� java�� ����
		String j = "java";
		
		// char jj = 'java';  �������� ���ڿ� ���� �Ұ�
		
		// ���� h�� �����Ͽ� hello�� ����
		String h = "hello";		
		
		// ���� j�� h�� �̿��Ͽ� ȭ�鿡 hello java�� ���
		System.out.println(h + " " + j);
		
		
		System.out.println("===== boolean =====");
		//���� ������ ����
		boolean flag;
		
		flag = true;
		//	flag = 100; �̷��Դ� �� �� ����.
		// 	���� �����Ϳ��� true / false �� ���� ����
		
		System.out.println(flag);
		
		//int�� ���� a�� �����ϸ鼭 10���� �ʱ�ȭ
		int a = 10;
		
		//int�� ���� b�� �����ϸ鼭 20���� �ʱ�ȭ
		int b = 20;
		
		//a�� b���� ū�� ���� ���� flag�� ����
		flag  = a > b;

		System.out.println(flag);
		
	}

}
