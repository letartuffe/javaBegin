package ios;

import java.io.*;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		byte console[] = new byte[1000];
		int input = 0;
		
		System.out.println("���ϸ��� �Է����ּ��� :");
		try {
			System.in.read(console);
			String fileName = 
					new String(console).trim();
			//FileInputStream ��ü ����
			fis = new FileInputStream(fileName);
			while((input = fis.read()) != -1){
				System.out.write(input);
			}
			//��Ʈ�� �ݱ�
			fis.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}




