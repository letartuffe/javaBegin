package ios;
import java.io.*;

public class InputStreamReadTest {

	public static void main(String[] args) {
		
		//System.in  --> ����Ʈ ��Ʈ�� --> 1����Ʈ
		//Reader --> ���� ��Ʈ�� --> 2����Ʈ
		// �̸� ������ InputStreamReader �� �ʿ�.
		Reader r = new InputStreamReader(System.in);
		
		System.out.println("���𰡸� �Է�..");
		
		//�Է¹��� �� ���
		int input = 0 ;
		
		try {
			while( (input = r.read())!= -1){
				System.out.write(input);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
