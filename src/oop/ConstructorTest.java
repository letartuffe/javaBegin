package oop;

public class ConstructorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�̸��� "kim"���� �����Ͽ� MyClass�� �ν��Ͻ� m ����
		
		//�����ڰ� �����Ƿ� �Ʒ��� ���� ��� �Ұ�
		//MyClass m = new MyClass();
		//�ʿ��ϸ� �⺻ ������ ����� ��.
		
		MyClass m = new MyClass("kim");
		
		//System.out.println(m.);
		//MyClass�� setName �޼��带 ȣ���Ͽ�
		//�̸��� "LEE"�� ����
		
		m.setName("Lee");
		
	}

}
