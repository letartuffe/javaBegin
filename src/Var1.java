/*
 * int �� ���� n ����
 * n�� 4�� ����
 * ȭ�鿡 n�� �� ���� ���� 3�� ���� ����� ǥ��
 * 
 * int �� ���� a�� �����ϸ鼭 15�� �ʱ�ȭ
 * int �� ���� b�� �����ϸ鼭 32�� �ʱ�ȭ
 * ���ؼ� 2�� ���� ��� ��� 23.5�� �ǰ�.
 * 
 * 
 */
public class Var1 {

	public static void main(String[] args) {
		int n ;
		n = 4 ;
		System.out.println(n*2+3);
		
		int a = 15;
		int b = 32;
		System.out.println((double)(a+b)/2);
		
		
		int c = 3+2 ;
		int d = 5-8 ;
		int e = 3*4 ;
		double f = (double)7/3 ;
		System.out.println("3+2�� "+c+"�Դϴ�");
		System.out.println("5-8�� "+d+"�Դϴ�");
		System.out.println("3���ϱ�4�� "+e+"�Դϴ�");
		System.out.println("7������3�� "+f+"�Դϴ�");
		
		byte aa = 10;
		byte bb = 20;
		//byte cc = (aa+bb);      
		byte cc = (byte) (aa+bb);
		System.out.println(cc);

		int aaa = 1000000;
		int bbb = 2000000;
		long ccc = (long) aaa*bbb;
		System.out.println(ccc);
		
		System.out.println("--------println---------");
		System.out.println("0*0 = " + (0*0));
		System.out.println("1*1 = " + (1*1));
		System.out.println("2*2 = " + (2*2));
		System.out.println("3*3 = " + (3*3));

		System.out.printf("\n-------printf-----------");
		System.out.printf("5*5 = %d%n", 5*5);
		System.out.printf("6*6 = %d%n", 6*6);
		System.out.printf("7*7 = %d%n", 7*7);
		System.out.printf("8*8 = %d%n", 8*8);
		System.out.printf("9*9 = %d%n", 9*9);
		
		
		
		int kor = 90;
		int eng = 40;
		
		boolean result;
		result = kor == eng ;
		System.out.println(result);
		
		result = kor != eng;
		System.out.println(result);
		
		//��� 90�� �̻��̰�
		//����� ������ 90�� �̻����� ���� �����
		//result�� �����ϰ� ���

		result = (kor >= 90) && (eng>= 90);
		
		System.out.println(result);
		
		result = (kor >= 90) || (eng>= 90);
		
		System.out.println(result);
		
		
		
		
		
		System.out.println("--------��Ʈ ������-------------");
		//������ ���� a�� �����ϰ� 10���� �ʱ�ȭ
		//������ ���� b�� �����ϰ� 7���� �ʱ�ȭ
		//������ ���� c�� �����ϰ�  a�� b�� & ������ ����� ����
		
		int ia = 10;
		int ib = 7;
		int ic = ia & ib; // 1010 & 0111 --- 0010 
		System.out.println(ic);
		
		
		
	}
}