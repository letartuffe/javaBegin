package str;

public class StringBufferTest {

	public static void main(String[] args) {
		String a = "Hello";
		a += " Hi";
		
		//StringBuffer�� ��ü�� ������ �ʰ�
		//�̷��� ���� �����ؼ� ����� �� ����.
		//StringBuffer c = "Goodbye";
		//�׷��� �̷��� ��ü�� ���� ���
		StringBuffer b = new StringBuffer();
		b.append("Good bye");
		
		System.out.println(b);
		
		//a = b;
		a = b.toString();
	}

}






