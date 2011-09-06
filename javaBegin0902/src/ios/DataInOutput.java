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
			//fos와 dos를 이용하여
			//dataInOut.txt 파일에
			//자바의 기본 자료형 중 4가지를 저장
			//false, 20000, 'T', 290.45
			fos = new FileOutputStream(fileName);
			dos = new DataOutputStream(fos);
			dos.writeBoolean(false);
			dos.writeInt(20000);
			dos.writeChar('T');
			dos.writeDouble(290.45);
		
			System.out.println("===========");
			//fis와 dis를 이용하여
			//dataInOut.txt 파일을 읽어서
			//화면에 출력
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





