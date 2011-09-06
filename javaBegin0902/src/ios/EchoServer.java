package ios;

import java.io.*;
import java.net.*;

public class EchoServer {
	ServerSocket server;		
	Socket socket;				
	static final int PORT = 5000;
	
	public EchoServer(){	
		try {
			server = new ServerSocket(PORT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("********* �� �� �� �� *********");
		System.out.println("Ŭ���̾�Ʈ�� ���� ��û ��� ��.....");
	
		while(true){
		try {
			socket = server.accept();
			EchoServerThread est = new EchoServerThread(socket);
			est.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}
}
