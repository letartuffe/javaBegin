package oop2.collect;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEX {

	public static void main(String[] args) {
		//Properties Ŭ������ ��ü prop ����
		
		Properties prop = new Properties();
		
		//user id password ����
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
		
		//Ű ���鸸 ��������.
		Enumeration keys = prop.propertyNames();
		while(keys.hasMoreElements()){
			System.out.println(keys.nextElement());
		}
	}
}
