package oop;

public class StaticBlock {
	int a;
	static String s;
	
	//static ��
	static{
		System.out.println(s);
		System.out.println("����� static �ʱ�ȭ ��");
		s = "�ʱ�ȭ ���� ��....";
	}
	
	public static void main(String[] args) {
		System.out.println("����� main �޼��� ��");
		System.out.println(s);
		
	}

}
