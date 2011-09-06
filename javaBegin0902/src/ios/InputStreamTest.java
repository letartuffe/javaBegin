package ios;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) 
				throws IOException {
		System.out.println("문자의 아스키 코드값을 알아보기");
		System.out.println("문자를 입력해주세요~");
		
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
