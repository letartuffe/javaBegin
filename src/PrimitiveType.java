
public class PrimitiveType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���� ������ ����
		boolean flag;
		flag = true;
		// flag = 100; ���� �����Ϳ��� true / false�� ���尡��
		
		System.out.println(flag);
		
		//--------------------------------------------------------
		
		int a =10; // int�� ���� a�� �����ϸ鼭 10���� �ʱ�ȭ
		int b =20; // int�� ���� b�� �����ϸ鼭 20���� �ʱ�ȭ
		
		flag = a > b;

		System.out.println(flag);
		
		System.out.println("-------char-----------------------------");
		
		char first = 'A';
		char second = '\u0041';
		char third = 65;

		System.out.println(first);
		System.out.println( second);
		System.out.println(third);
		
		System.out.println("-------escape sequence  ---------------");
		System.out.println("\"A\"");
		System.out.println("\"B\"\tC\nD");
		
		
		//����j�� �����Ͽ� java�� ����
		//char�����δ� �������� ���� ����. String ���
		String j = "java";
		System.out.println(j);
		
		//����h�� �����Ͽ� hello�� ����
		String h = "hello";
		
		//���� j,h�� �̿��Ͽ� hello java�� ���
		System.out.println(j+" "+h);
		
		System.out.println("----������ ������  ---------------");
		
		int c = 100;
		long d = 20000000000L;
		byte e = 127;

		System.out.println(d);

		System.out.println("----�Ǽ��� ������  ---------------");
		float f = 3.14f;
		double g = 3.14;
		System.out.println();
		
		System.out.println("----�Ǽ��� ���  ---------------");
		final double PI = 3.14 ;
		
	}

}
