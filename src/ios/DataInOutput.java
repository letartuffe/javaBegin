package ios;

import java.io.*;
public class DataInOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fileName = " dataInOut.txt";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		// fos�� dos�̿� �ڹٱ⺻ �ڷ��� ����
		//false 20000 'T' 290.45

		try {
			fos = new FileOutputStream(fileName);
			dos = new DataOutputStream(fos);
			
			dos.writeBoolean(false);
			dos.writeInt(20000);
			dos.writeChar('T'); ///
			dos.writeDouble(290.45);
			dos.close();
			fos.close();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{

			try {
				if(dos != null){ dos.close();}
				if(dos != null){ fos.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("============================");
		
		//fis�� dis�̿�  ���� �о ȭ�鿡 ���.
		try {
			
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
