package ios;

import java.io.*;

public class DataInOutput {
	public static void main(String[] args) {
		String fileName = "dataInOut.txt";
		FileInputStream  fis = null;
		FileOutputStream fos = null;
		DataInputStream  dis = null;
		DataOutputStream dos = null;
		
		try {
			//fos�� dos�� �̿��Ͽ�
			//dataInOut.txt ���Ͽ�
			//�ڹ��� �⺻ �ڷ��� �� 4������ ����
			//false, 20000, 'T', 290.45
			fos = new FileOutputStream(fileName);
			dos = new DataOutputStream(fos);
			dos.writeBoolean(false);
			dos.writeInt(20000);
			dos.writeChar('T');
			dos.writeDouble(290.45);
		
			System.out.println("===========");
			//fis�� dis�� �̿��Ͽ�
			//dataInOut.txt ������ �о
			//ȭ�鿡 ���
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}





