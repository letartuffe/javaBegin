package ios;

import java.io.*;
public class FileOutputStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;				//(1)
		byte console[] = new byte[1000];
		int input = 0;
		
		System.out.println("파일명을 입력해주세요 :");
		try {
			System.in.read(console);
			String fileName = 
					new String(console).trim();
			fos = new FileOutputStream(fileName);//(2)
			System.out.println("내용을 입력해주세요." +
							   "(입력완료는 Ctrl+z)" );
			while((input = System.in.read()) != -1){  //(2)-1
				fos.write(input);		//(3)
			}
			System.out.println("\n현재 디렉토리의 " + 
						       fileName + "파일에 저장 완료!");
			fos.close();						//(4)
		}catch (FileNotFoundException e) {	e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} finally{
			try {	if(fos!=null) fos.close();	//(5)
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}

}
