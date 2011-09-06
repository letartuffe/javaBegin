package ios;

import java.io.*;
import java.net.*;

public class EchoServerThread extends Thread{
	Socket socket ;	
	
	InputStream is;
	OutputStream os;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	
	String receiveData ;	
	
	public EchoServerThread(Socket socket){
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
	
	@Override
	public void run() {
		try {
			while(true){
				receiveData = (String)ois.readObject();
				System.out.print("Ŭ���̾�Ʈ IP : "+ socket.getInetAddress());
				System.out.println("\t���� ������  :"+ receiveData);
				
				oos.writeObject(receiveData);
				oos.flush();
			}
		} catch(EOFException eo){
			System.out.println("Ŭ���̾�Ʈ ���� ����!");
		}	catch(NullPointerException ne){
			System.out.println("���� ������ ����!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(is!=null) 		is.close();
				if(ois!=null) 		ois.close();
				if(os!=null) 		os.close();
				if(oos!=null) 		oos.close();
				if(socket!=null) 	socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

