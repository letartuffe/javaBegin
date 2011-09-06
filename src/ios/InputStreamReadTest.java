package ios;
import java.io.*;

public class InputStreamReadTest {

	public static void main(String[] args) {
		
		//System.in  --> 바이트 스트림 --> 1바이트
		//Reader --> 문자 스트림 --> 2바이트
		// 이를 연결할 InputStreamReader 가 필요.
		Reader r = new InputStreamReader(System.in);
		
		System.out.println("무언가를 입력..");
		
		//입력받은 값 출력
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
