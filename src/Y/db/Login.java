package db.main;

import java.io.*;
import java.sql.Connection;

public class Login {
	String id;
	String pass;
	Connection con ;
	BufferedReader br;
	
	public void Login(){
		
		System.out.println("�α��� ���ּ���");
		
		br = new BufferedReader( new InputStreamReader(System.in));
		
			try {
					System.out.print("id : ");
					String id = br.readLine();
					
					System.out.print("pass : ");
					String pass = br.readLine();
				
					System.out.println("id : " + id );
					System.out.println("pass : *****");
					
				if (id.equals("admin") && pass.equals("1234")){
					System.out.println("����� ������ �����մϴ�.");
				}else{System.out.println("��� ������ �����ϴ�.");
				System.exit(0);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}