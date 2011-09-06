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
			//jdbc.properties ������ �Ű�������
			//FileInputStream ��ü ����
			fis = new FileInputStream("src\\db\\jdbc.properties");
		
			//Properties ��ü ����
			pro = new Properties();
			
			//properties �о����(load �޼��� �̿�)
			pro.load(fis);
			
			//driver, dbURL, dbID, dbPW�� Ű�� 
			//������Ƽ�� ���� �о�ͼ� ������ �� ������ �����ϰ�
			//ȭ�鿡 ���
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
