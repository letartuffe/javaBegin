package oop2.collect;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEX {

	public static void main(String[] args) {
		//Properties 클래스의 객체 prop 생성
		
		Properties prop = new Properties();
		
		//user id password 저장
		prop.setProperty("user", "KIM");
		prop.setProperty("id", "admon");
		prop.setProperty("pw", "1111");
		

		String user = null;
		String id = null;
		String pw = null;
		
		
		user = prop.getProperty("user");
		id = prop.getProperty("id");
		pw = prop.getProperty("pw");
		
		System.out.println(user + id + pw);
		
		//키 값들만 가져오기.
		Enumeration keys = prop.propertyNames();
		while(keys.hasMoreElements()){
			System.out.println(keys.nextElement());
		}
	}
}
