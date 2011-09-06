package ios;

import java.io.*;
import java.net.*;

public class EchoServer {
	ServerSocket serverSocket;
	Socket socket;
	static final int PORT = 5000;
	
	
	public EchoServer() {
		try {

			//5000번 포트를 사용하는 ServerSocket 생성
			serverSocket = new ServerSocket(PORT);

			System.out.println("~~~~~에코 서버~~~~~~");
			System.out.println("~~클라이언트 접속 대기중~");
			
			//서버소켓의 accept() 메소드를 호출
			//반환되는 소켓을 socket에 저장
			while(true){
				socket = serverSocket.accept();
				//socket을 매개변수로 EchoServerThread 객체 t 생성
				//t를 이용하여 스레드 시작.
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
