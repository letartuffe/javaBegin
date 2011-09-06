package ios;

import java.io.*;

public class FileOutputStreamBuffered {
	public static void main(String[] args) {
		//FileOutputStream�� BufferedOutputStream�� �̿��Ͽ�
		//bufferedTest.txt ���Ͽ� 12345678�� ���(for�� �̿�)
		//��, ������ �뷮�� 5����Ʈ
		
		String fileName = "buffferedTest.txt";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			bos = new BufferedOutputStream(fos, 5);
			
			for(int i='1' ; i<='8' ;i++){
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {	if(bos!=null) bos.close();
					if(fos!=null) fos.close();	
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}
}








