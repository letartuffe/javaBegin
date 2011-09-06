package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		Properties pro = null;
		
		try {
			//jdbc.properties 파일을 매개변수로
			//FileInputStream 객체 생성
			fis = new FileInputStream("src\\db\\jdbc.properties");
		
			//Properties 객체 생성
			pro = new Properties();
			
			//properties 읽어오기(load 메서드 이용)
			pro.load(fis);
			
			//driver, dbURL, dbID, dbPW를 키로 
			//프로퍼티스 값을 읽어와서 다음의 각 변수에 저장하고
			//화면에 출력
			String driver = pro.getProperty("driver");
			String url =  pro.getProperty("dbURL");
			String id  =  pro.getProperty("dbID");
			String pw  =  pro.getProperty("dbPW");
			
			System.out.println("driver : " + driver);
			System.out.println("url : " + url);
			System.out.println("id : " + id);
			System.out.println("pw : " + pw);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}

}
