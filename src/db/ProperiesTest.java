package db;

import java.io.*;
import java.util.*;

public class ProperiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream fis = null ;
		Properties pro = new Properties();
		
		//jdbc.properties 파일을 매개변수로
		//FileInputStream 객체 생성
		
		//Properties 객체 생성
		
		//Properties 읽어오기 
		
		//driver, dbURL, dbID, dbPW을 키로 프로퍼티스 값을 읽어와서 다음의 각 변수에 저장하고
		//db 연결 확인 결과 출력 
		
		String driver ="";
		String url = "";
		String id = "";
		String password = "";
		
		
		try {
			fis = new FileInputStream("C:\\javaworks\\javaBegin\\src\\jdbc.Properties");
			pro.load(fis);
			
			driver = pro.getProperty("dbdriver");
			url = pro.getProperty("dburl");
			id = pro.getProperty("dbID");
			password = pro.getProperty("dbPW");
			
			System.out.println(driver + url + id + password);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
