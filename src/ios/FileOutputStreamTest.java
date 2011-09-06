package ios;

import java.io.*;

public class FileOutputStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		

		//���� ����� ��ü ���� ... 
		FileOutputStream fos = null;
		
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
			fos = new FileOutputStream(fileName); //2
			
			//���� ���� ������ �д� ����.
			//input = fis.read()) != -1   --> ���� ������ �о��... 
			//��͵� �� ����Ʈ�� �дµ�.
			
			System.out.println("���� ������ �Է����ּ���");
			
			while((input = System.in.read()) != -1){
				fos.write(input); //3
			}//while
			
			
			
			//������ ������ ������ ����.. �� �ݾ������.
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
			try {
				//������ �ȴ����ٸ�!!!! �����ÿ�.
				if (fos != null) fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}//try-catch 

		}//try-catch
	

	}

}
