package ios;

import java.io.*;

public class FileInputStreamBuffered {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
				
		byte console[] = new byte[1000];
		int input = 0;
		
		System.out.println("파일명을 입력해주세요 :");
		try {
			System.in.read(console);
			String fileName = 
					new String(console).trim();
			//FileInputStream 객체 생성
			fis = new FileInputStream(fileName);
			//BufferedInputStream 객체 생성
			bis = new BufferedInputStream(fis);
			
			while((input = fis.read()) != -1){
				System.out.write(input);
			}
			//스트림 닫기
			fis.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null) fis.close();
				if(bis!=null) bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
