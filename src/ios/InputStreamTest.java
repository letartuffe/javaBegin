package ios;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
	
	
	// -1  --> ��Ʈ�� Z ����.
	
	public static void main(String[] args) throws IOException {
		System.out.println("������ �ƽ�Ű �ڵ尪�� �˾ƺ���.");
		System.out.println("���ڸ� �Է����ּ���.");
		
		int input = 0 ;
		
		//���ڿ��� �Է¹޾� ó��..  -1 �� ���ö����� ���Ƿ�.. �׳� ��Ʈ�� Z �ϸ� �����
//		while((input = System.in.read()) != -1){
//			if(input == '\r' || input == '\n') continue ;
//			System.out.println( (char)input +" : "+input);
//			
//		}
//		
		System.out.println("==InputStream==");
		InputStream ins = System.in ;
		
		while((input = ins.read()) != -1){
			if(input == '\r' || input == '\n') continue ;
			System.out.println( (char)input +" : "+input);
			
		}


	
	
	}

}