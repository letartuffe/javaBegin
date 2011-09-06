package ios;

import java.io.*;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		//���� ����� ��ü ���� ... 
		FileInputStream fis = null;
		
		//FileInputStream�� �� ����Ʈ�� �о���Ƿ�.. 
		//�о�� ����Ʈ�� ������ ����
		byte console[] = new byte[1000];
		
		int input = 0;
		
		
		System.out.println("���ϸ��� �Է����ּ���.");
		
		try {
			//System.in.read  -->  ȭ�鿡�� �Է� �޴� �κ�.. 
			//��͵� �ѹ���Ʈ��..�дµ�..
			//���⼭�� �����̸��� �Է� �������̹Ƿ�..
			//System.in.read�� ���� �Է¹��� ������ console�� �����
			System.in.read(console);
			
			//console�� Byte �����̹Ƿ�.. String���� ��ȯ
			//trim() �� ���ڿ� �յڸ� �ڸ��� �޼ҵ� -- ����(13,10)���� ����� ���� ���
			String fileName = new String(console).trim();

			//FileInputStream 
			//������ ������FileInputStream ��ü�� ����
			//�̶� �Ű������� 
			//������ String���� ��ȯ�� fileName ��� -- �Է¹��� ���ϸ�.
			//��⼭ �Է¹��� ������ ���� ���� �߻�.
			fis = new FileInputStream(fileName);
			
			
			//���� ���� ������ �д� ����.
			//input = fis.read()) != -1   --> ���� ������ �о��... 
			//��͵� �� ����Ʈ�� �дµ�.
			while((input = fis.read()) != -1){
				//�� ���ھ� ȭ�鿡 ���.
				System.out.print((char)input);
			}//while
			
			//������ ������ ������ ����.. �� �ݾ������.
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
			try {
				//������ �ȴ����ٸ�!!!! �����ÿ�.
				if (fis != null) fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}//try-catch 

		}//try-catch
	}
}
