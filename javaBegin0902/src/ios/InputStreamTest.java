package ios;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) 
				throws IOException {
		System.out.println("������ �ƽ�Ű �ڵ尪�� �˾ƺ���");
		System.out.println("���ڸ� �Է����ּ���~");
		
		int input = 0;
		
//		while((input = System.in.read()) != -1){
//			if( input==13 || input==10) 
//				continue;
//			System.out.println(
//				(char)input + " : " +input
//			);
//		}
		
		System.out.println("==InputStream==");
		InputStream ins = System.in;		
		while((input = ins.read()) != -1){
			if( input==13 || input==10) 
				continue;
			System.out.println(
				(char)input + " : " +input
			);
		}
	}

}
