package ios;

import java.io.*;
import java.net.*;

public class EchoClient {
	Socket socket;
	String ip;
	static final int PORT = 5000;
	
	BufferedReader read;
	InputStream is;
	ObjectInputStream ois;
	OutputStream os;
	ObjectOutputStream oos;
	
	String sendData;
	String receiveData;
	
	public EchoClient(String ip){
		//1.�������� �Ű������� �Ѿ�� �����ּҸ� ip�� ����
		this.ip = ip;
		
		try {
			//2.�����ּҿ� ��Ʈ��ȣ�� �Ű������� ���� ����		
			socket = new Socket(ip, PORT);
		
			//3.Ű����κ��� ���� ���� BufferedReader ��ü	����	
			read = new BufferedReader(new InputStreamReader(System.in));
			
			//4.socket�� �̿��Ͽ� ��� ��Ʈ�� os ����		
			os = socket.getOutputStream();
			
			//5.os�� �Ű������� ��ü ��� ��Ʈ�� oos ����		
			oos = new ObjectOutputStream(os);
			
			//�޽��� ���� ó�� ���� ó�� ----------------
			//6.socket�� �̿��Ͽ� �Է� ��Ʈ�� is ����		
			is = socket.getInputStream();
			
			//7.is�� �Ű������� ��ü �Է� ��Ʈ�� ois ����
			ois = new ObjectInputStream(is);
			
			System.out.print("�Է� : ");
		
			//8.�޽����� �Է¹޾Ƽ� sendData�� ����
			//  (�Է��� null�� �ƴ� ���� �ݺ�ó��)
			while( (sendData = read.readLine()) != null){
			
				//9.�Է¹��� �޽����� oos�� �̿��Ͽ� ������ ����
				oos.writeObject(sendData);
				
				//10.oos ����
				oos.flush();
				
				//11."quit"�� �Է¹����� ����
				if(sendData.equals("quit")) {
					break;
				}else{				
					//12.�����κ��� �޽����� �޾Ƽ� receiveData�� ����
					receiveData = (String) ois.readObject();
					
					//13.���� �޽����� ȭ�鿡 ���	
					System.out.println("["+ socket.getInetAddress() +"]�� ���� �޽��� : " +
									  receiveData);
					System.out.print("�Է� : ");
				}
			}
		//14.����ó�� �� ��Ʈ��/���� �ݱ� ó��
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if(is!=null) 		is.close();
				if(ois!=null) 		ois.close();
				if(os!=null) 		os.close();
				if(oos!=null) 		oos.close();
				if(read!=null) 		read.close();
				if(socket!=null) 	socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new EchoClient("localhost");
//		192.168.0.151
	}
}


