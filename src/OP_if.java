//���� ���� ������
public class OP_if {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ���� mod ����, ���ǰ� �ʱ�ȭ
		// ���ǻ��׿����� �̿�
		//Ȧ���� �Է��Ͻ� ���ڴ� Ȧ�� �Դϴ�.
		//¦���� �Է��Ͻ� ���ڴ� ¦�� �Դϴ�. 
		//���

		int mod = 235;
		String test;
		
		test = mod%2 == 0 ? "Ȧ":"¦";
		System.out.printf("�Է��Ͻ� ���ڴ� %s���Դϴ�\n",test);
		
		//10�� 10.0f�� ����
		//'0'�� 0�� ����
		//'A'�� 65�� �ٸ���
		
		int iten = 10;
		float itenf = 10f;
		boolean bool;
		
		bool = iten == itenf ? true : false ;
		System.out.println(bool);
		
		int szero = 0;
		char czero = '0';
		
		bool = szero == czero ? true : false ;
		System.out.println(bool);
		
		int ia = 65;
		char a = 'A';
		
		bool =ia == a ? true : false ;
		System.out.println(bool);
		
		
		
		
	}

}
