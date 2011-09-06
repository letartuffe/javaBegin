package ios;

import java.io.*;
import java.net.*;

public class EchoServerThread extends Thread {
	Socket socket;
	
	InputStream is ;
	ObjectInputStream ois;
	OutputStream os;
	ObjectOutputStream oos;
	
	String receiveData ;
	
	//������ �Ű������� �޾Ƽ� �ʱ�ȭ �ϴ� ������ �����ε�
	//��Ʈ�� ��ü�� ����	
	public EchoServerThread(Socket socket) {
		this.socket = socket;
		try {
			is = socket.getInputStream();
			ois = new ObjectInputStream(is);
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	//������ �۾� ó�� �޼��� �������̵�
	//Ŭ���̾�Ʈ���� ���� �����͸� ois�� ���� �о 
	//receiveData�� �����ϰ� ��ȭ�鿡 ���
	public void run(){
		
		
		try {
			
			receiveData = (String) ois.readObject();
			System.out.println(receiveData+"   -- ����!!");
			
			receiveData = receiveData + "-- �������� �޾Ҵ� ����. ";
			
			
			//oos �̿��Ͽ� receiveData �� �����͸� Ŭ���̾�Ʈ
			//oos ����.
			
			oos.writeObject(receiveData);
			oos.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (oos != null) oos.close();
				if (ois != null) ois.close();
				if (os != null) os.close();
				if (is != null) is.close();
				if (socket != null) socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}


	
	

}
