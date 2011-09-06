package ios;

import java.io.*;
import java.net.*;

public class EchoClient {
	Socket socket;
	String ipAddress;
	static final int PORT = 5000;
	
	BufferedReader read ;   //2����Ʈ..
	InputStream is;				
	ObjectInputStream ois;
	OutputStream os;
	ObjectOutputStream oos;
	
	String sendData ;
	String receiveData ;
	
	public EchoClient(String ip){
		//�������� �Ű������� �Ѿ�� �����ּҸ� ipaddress�� ����
		ipAddress = ip;
		
		try {
			//���� ���� - �����ּ�, ��Ʈ��ȣ
			socket = new Socket(ipAddress, PORT);
			
			//Ű����κ��� �޽����� ���� �Է� ��Ʈ�� ����.
			//Ű����κ��� �Է� �ޱ�
			read = new BufferedReader(new InputStreamReader(System.in)); 
			

			
			//socket�� �̿��Ͽ� ��� ��Ʈ�� os ����
			os = socket.getOutputStream() ; 
			//os�� �̿��Ͽ� ��ü ��� ��Ʈ�� oos ����
			oos = new ObjectOutputStream(os);
			
			
		//�޼��� ����ó������ ó��
			//socket�� �̿��Ͽ� �Է� ��Ʈ�� is ����
			is = socket.getInputStream();
			//is�� �̿��Ͽ� ��ü �Է� ��Ʈ�� ois ����
			ois = new ObjectInputStream(is);

			System.out.print("�Է�  : " );
			
			while ( (sendData = read.readLine()) != null  ){	
				

				//quit�� �Է� ������ ����
				if(sendData.equals("quit")) {
					break;
				}else{
				
					//�Է¹��� �޼����� oos�� �̿��Ͽ� ������ ����
					oos.writeObject(sendData);
					
					//oos ����
					oos.flush();
					
					//�����κ��� �޼����� �޾� receiveData�� ����
					receiveData = (String) ois.readObject();
					//���� �޼��� ȭ�鿡 ���
					
					System.out.println(receiveData) ;
				}
			}			
		//����ó�� �� ��Ʈ��/���� �ݱ� ó��
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (ois != null) ois.close();
				if (oos != null) oos.close();
				if (is != null) is.close();
				if (os != null) os.close();
				if (read != null) read.close();
				if (socket != null) socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}//EchoClient cons..
	
	public static void main(String[] args) {
		//new EchoClient("192.168.0.151");
		new EchoClient("localhost");
	}

}

