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
	
	//소켓을 매개변수로 받아서 초기화 하는 생성자 오버로딩
	//스트림 객체들 생성	
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
	//스레드 작업 처리 메서드 오버라이딩
	//클라이언트에서 보낸 데이터를 ois를 통해 읽어서 
	//receiveData에 저장하고 ㅈ화면에 출력
	public void run(){
		
		
		try {
			
			receiveData = (String) ois.readObject();
			System.out.println(receiveData+"   -- 서버!!");
			
			receiveData = receiveData + "-- 서버에서 받았다 보냄. ";
			
			
			//oos 이용하여 receiveData 의 데이터를 클라이언트
			//oos 비우기.
			
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
