package ios;

import java.io.*;
public class FileOutputStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;				//(1)
		byte console[] = new byte[1000];
		int input = 0;
		
		System.out.println("���ϸ��� �Է����ּ��� :");
		try {
			System.in.read(console);
			String fileName = 
					new String(console).trim();
			fos = new FileOutputStream(fileName);//(2)
			System.out.println("������ �Է����ּ���." +
							   "(�Է¿Ϸ�� Ctrl+z)" );
			while((input = System.in.read()) != -1){  //(2)-1
				fos.write(input);		//(3)
			}
			System.out.println("\n���� ���丮�� " + 
						       fileName + "���Ͽ� ���� �Ϸ�!");
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
