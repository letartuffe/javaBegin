package str;

public class StringBufferTest {

	public static void main(String[] args) {
		
		// 
		//String a = new String(); �Ʒ��� ����
		String a = "Hellow";
		a += "hi!" ;
		
		
		
		//String�� �Ʒ��� ���� ����� ����. �ٸ��� �ȵ�
		//StringBuffer c = "Goodbye" ;
		
		StringBuffer b = new StringBuffer();
		b.append("Goodbye");
		
		System.out.println(b);
		
		//�Ʒ��� �ȵ�. String �� StringBuffer�� �ȵ�
		//a = b;
		
		
		a = b.toString();
		
		
		
		

	}

}
