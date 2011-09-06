package ios;

import java.io.*;

public class InputStreamReadTest {

	public static void main(String[] args) {
		
		System.out.println("무언가 입력해주세요~ : ");
		//키보드로부터 입력 받아 Reader 객체에 저장하고
		Reader r = new InputStreamReader(System.in);
		
		int input = 0;
		
		try {
			while( (input=r.read()) != -1){
				//입력받은 값을 화면에 출력하기~
				System.out.write(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
