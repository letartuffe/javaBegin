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
		//1.생성자의 매개변수로 넘어온 서버주소를 ip에 저장
		this.ip = ip;
		
		try {
			//2.서버주소와 포트번호를 매개변수로 소켓 생성		
			socket = new Socket(ip, PORT);
		
			//3.키보드로부터 값을 읽을 BufferedReader 객체	생성	
			read = new BufferedReader(new InputStreamReader(System.in));
			
			//4.socket을 이용하여 출력 스트림 os 생성		
			os = socket.getOutputStream();
			
			//5.os를 매개변수로 객체 출력 스트림 oos 생성		
			oos = new ObjectOutputStream(os);
			
			//메시지 수신 처리 위한 처리 ----------------
			//6.socket을 이용하여 입력 스트림 is 생성		
			is = socket.getInputStream();
			
			//7.is를 매개변수로 객체 입력 스트림 ois 생성
			ois = new ObjectInputStream(is);
			
			System.out.print("입력 : ");
		
			//8.메시지를 입력받아서 sendData에 저장
			//  (입력이 null이 아닌 동안 반복처리)
			while( (sendData = read.readLine()) != null){
			
				//9.입력받은 메시지를 oos를 이용하여 서버로 전송
				oos.writeObject(sendData);
				
				//10.oos 비우기
				oos.flush();
				
				//11."quit"를 입력받으면 종료
				if(sendData.equals("quit")) {
					break;
				}else{				
					//12.서버로부터 메시지를 받아서 receiveData에 저장
					receiveData = (String) ois.readObject();
					
					//13.받은 메시지를 화면에 출력	
					System.out.println("["+ socket.getInetAddress() +"]가 보낸 메시지 : " +
									  receiveData);
					System.out.print("입력 : ");
				}
			}
		//14.예외처리 및 스트림/소켓 닫기 처리
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


