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
		
		//jdbc.properties ������ �Ű�������
		//FileInputStream ��ü ����
		
		//Properties ��ü ����
		
		//Properties �о���� 
		
		//driver, dbURL, dbID, dbPW�� Ű�� ������Ƽ�� ���� �о�ͼ� ������ �� ������ �����ϰ�
		//db ���� Ȯ�� ��� ��� 
		
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
