package oop2;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEX {

	public static void main(String[] args) {
		//Properties 클래스의 객체 prop 생성
		Properties prop = new Properties();
		
		//user, id, pw 속성 저장
		prop.setProperty("user", "KIM");
		prop.setProperty("id", "admin");
		prop.setProperty("pw", "1111");
		
		String user;
		String id;
		String pw;
		
		//속성에 저장된 user, id, pw 가져오기
		//프로퍼티의 key 이용 
		user = prop.getProperty("user");
		id = prop.getProperty("id");
		pw = prop.getProperty("pw");
		
		System.out.println(user + " : " + id + " : " + pw);
		
		System.out.println("============");
		
		//키값들만 가져오기
		Enumeration keys = prop.propertyNames();
		while(keys.hasMoreElements()){
			System.out.println(
					keys.nextElement()
			);
		}
	}

}












