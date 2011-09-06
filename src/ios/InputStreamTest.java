package ios;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
	
	
	// -1  --> 컨트롤 Z 종료.
	
	public static void main(String[] args) throws IOException {
		System.out.println("문자의 아스키 코드값을 알아보기.");
		System.out.println("문자를 입력해주세요.");
		
		int input = 0 ;
		
		//문자열을 입력받아 처리..  -1 이 나올때까지 도므로.. 그냥 콘트롤 Z 하면 종료됨
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