package ios;

import java.io.*;

public class InputStreamReadTest {

	public static void main(String[] args) {
		
		System.out.println("���� �Է����ּ���~ : ");
		//Ű����κ��� �Է� �޾� Reader ��ü�� �����ϰ�
		Reader r = new InputStreamReader(System.in);
		
		int input = 0;
		
		try {
			while( (input=r.read()) != -1){
				//�Է¹��� ���� ȭ�鿡 ����ϱ�~
				System.out.write(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
