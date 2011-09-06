package ios;

import java.io.*;
import java.net.*;

public class EchoClient {
	Socket socket;
	String ipAddress;
	static final int PORT = 5000;
	
	BufferedReader read ;   //2바이트..
	InputStream is;				
	ObjectInputStream ois;
	OutputStream os;
	ObjectOutputStream oos;
	
	String sendData ;
	String receiveData ;
	
	public EchoClient(String ip){
		//생성자의 매개변수로 넘어온 서버주소를 ipaddress에 저장
		ipAddress = ip;
		
		try {
			//소켓 생성 - 서버주소, 포트번호
			socket = new Socket(ipAddress, PORT);
			
			//키보드로부터 메시지를 읽을 입력 스트림 생성.
			//키보드로부터 입력 받기
			read = new BufferedReader(new InputStreamReader(System.in)); 
			

			
			//socket을 이용하여 출력 스트림 os 생성
			os = socket.getOutputStream() ; 
			//os를 이용하여 객체 출력 스트림 oos 생성
			oos = new ObjectOutputStream(os);
			
			
		//메세지 수신처리위한 처리
			//socket을 이용하여 입력 스트림 is 생성
			is = socket.getInputStream();
			//is를 이용하여 객체 입력 스트림 ois 생성
			ois = new ObjectInputStream(is);

			System.out.print("입력  : " );
			
			while ( (sendData = read.readLine()) != null  ){	
				

				//quit를 입력 받으면 종료
				if(sendData.equals("quit")) {
					break;
				}else{
				
					//입력받은 메세지를 oos를 이용하여 서버로 전송
					oos.writeObject(sendData);
					
					//oos 비우기
					oos.flush();
					
					//서버로부터 메세지를 받아 receiveData에 저장
					receiveData = (String) ois.readObject();
					//받은 메세지 화면에 출력
					
					System.out.println(receiveData) ;
				}
			}			
		//예외처리 및 스트림/소켓 닫기 처리
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

