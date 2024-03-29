package ios;

import java.io.*;

public class FileInputStreamBuffered {

	public static void main(String[] args) {
		
		//파일 입출력 객체 선언 ... 
		FileInputStream fis = null;
		//버퍼 객체 선언
		BufferedInputStream bis = null;
		
		//FileInputStream은 한 바이트씩 읽어오므로.. 
		//읽어온 바이트를 저장할 변수
		byte console[] = new byte[1000];
		
		int input = 0;
		
		
		System.out.println("파일명을 입력해주세요.");
		
		try {
			//System.in.read  -->  화면에서 입력 받는 부분.. 
			//요것도 한바이트씩..읽는듯..
			//여기서는 파일이름을 입력 받을것이므로..
			//System.in.read를 통해 입력받은 내용이 console에 저장됨
			System.in.read(console);
			
			//console은 Byte 변수이므로.. String으로 변환
			//trim() 은 문자열 앞뒤를 자르는 메소드 -- 엔터(13,10)값을 지우기 위해 사용
			String fileName = new String(console).trim();

			//FileInputStream 
			//위에서 선언한FileInputStream 객체를 생성
			//이때 매개변수로 
			//위에서 String으로 변환한 fileName 사용 -- 입력받은 파일명.
			//요기서 입력받은 파일을 여는 일이 발생.
			fis = new FileInputStream(fileName);
			
			//파일인풋스트림 객체 생성
			bis = new BufferedInputStream(fis);
			
			//실제 파일 내용을 읽는 내용.
			//input = fis.read()) != -1   --> 파일 끝까지 읽어라... 
			//요것도 한 바이트씩 읽는듯.
			while((input = fis.read()) != -1){
				//한 글자씩 화면에 출력.
				System.out.print((char)input);
			}//while
			
			//위에서 열었던 파일을 닫음.. 꼭 닫아줘야함.
			bis.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
			try {
				//파일이 안닫혔다면!!!! 닫으시오.
				if (fis != null) fis.close();
				if (bis != null) bis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}//try-catch 

		}//try-catch
	}
}
