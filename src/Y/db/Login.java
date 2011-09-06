package db.main;

import java.io.*;
import java.sql.Connection;

public class Login {
	String id;
	String pass;
	Connection con ;
	BufferedReader br;
	
	public void Login(){
		
		System.out.println("로그인 해주세요");
		
		br = new BufferedReader( new InputStreamReader(System.in));
		
			try {
					System.out.print("id : ");
					String id = br.readLine();
					
					System.out.print("pass : ");
					String pass = br.readLine();
				
					System.out.println("id : " + id );
					System.out.println("pass : *****");
					
				if (id.equals("admin") && pass.equals("1234")){
					System.out.println("사용자 관리를 시작합니다.");
				}else{System.out.println("사용 권한이 없습니다.");
				System.exit(0);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}