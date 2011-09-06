package ios;

import java.io.*;

public class FileOutputStreamBuffered {

	public static void main(String[] args) {
		//FileOutputStream 과 BufferedOutputStream을 이용하여
		//bufferedTest.txt 파일에 12345678을 출력 (for문 이용)
		//단 버퍼 용량은 5바이트
		//닫는 순서 주의...
		
		
		String fileName = "bufferedTest.txt";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			bos = new BufferedOutputStream(fos, 5) ;
			
			for(int i = '1' ; i<='8';i++){
				bos.write(i);
			}
			bos.close();

			fos.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{

			try {
				if(bos != null){ bos.close();}
				if(fos != null){ fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		
		
		
		
		
		
		

	}

}
