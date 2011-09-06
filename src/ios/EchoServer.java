package ios;

import java.io.*;
import java.net.*;

public class EchoServer {
	ServerSocket serverSocket;
	Socket socket;
	static final int PORT = 5000;
	
	
	public EchoServer() {
		try {

			//5000�� ��Ʈ�� ����ϴ� ServerSocket ����
			serverSocket = new ServerSocket(PORT);

			System.out.println("~~~~~���� ����~~~~~~");
			System.out.println("~~Ŭ���̾�Ʈ ���� �����~");
			
			//���������� accept() �޼ҵ带 ȣ��
			//��ȯ�Ǵ� ������ socket�� ����
			while(true){
				socket = serverSocket.accept();
				//socket�� �Ű������� EchoServerThread ��ü t ����
				//t�� �̿��Ͽ� ������ ����.
				EchoServerThread t = new EchoServerThread(socket);
				t.start();		
			}
			

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} finally{
			try {
				if (serverSocket != null) serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		new EchoServer();
	}

}
