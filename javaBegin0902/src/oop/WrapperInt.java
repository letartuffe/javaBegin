package oop;

public class WrapperInt {

	public static void main(String[] args) {
		String num1 = "100";
		String num2 = "200";
		
		System.out.println(num1 + num2);

		System.out.println(Integer.parseInt(num1) 
						   + Integer.parseInt(num2));
		
		Integer aa = new Integer(num1);
		Integer bb = new Integer(num2);
		
		//��ڽ� - ��ü�� �⺻ �ڷ����� �ٷ� ����
		int aaa = new Integer(num1);
		int bbb = new Integer(num2);
		
		//�ڽ� - �⺻�ڷ����� ��ü���� ����
		aa = 100000;
		bb = 200000;
	}

}
