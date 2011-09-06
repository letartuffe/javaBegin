package oop2;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEX {

	public static void main(String[] args) {
		//Properties Ŭ������ ��ü prop ����
		Properties prop = new Properties();
		
		//user, id, pw �Ӽ� ����
		prop.setProperty("user", "KIM");
		prop.setProperty("id", "admin");
		prop.setProperty("pw", "1111");
		
		String user;
		String id;
		String pw;
		
		//�Ӽ��� ����� user, id, pw ��������
		//������Ƽ�� key �̿� 
		user = prop.getProperty("user");
		id = prop.getProperty("id");
		pw = prop.getProperty("pw");
		
		System.out.println(user + " : " + id + " : " + pw);
		
		System.out.println("============");
		
		//Ű���鸸 ��������
		Enumeration keys = prop.propertyNames();
		while(keys.hasMoreElements()){
			System.out.println(
					keys.nextElement()
			);
		}
	}

}












