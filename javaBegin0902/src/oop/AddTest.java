package oop;

public class AddTest {

	public static void main(String[] args) {
		add(100, 200);
		int eeja = interest(10000);
		System.out.println("���ڴ� " + eeja);
	}
	
	private static void add(int i, int j) {
		System.out.println("��������� " + (i+j) + "�Դϴ�.");
		
	}

	public static int interest(int wongum){
		//������ 15% ���� ���
		int eeja = (int)(wongum * 0.15);
		return eeja;
	}
}
