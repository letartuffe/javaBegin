package db.dao;

import java.io.*;
import java.sql.*;
import java.util.*;

public class DB_Connect {
		static FileInputStream fis; 
		static Properties pro;
	
		static Connection getConnection() throws SQLException{
			String driver="";
			String url="";
			String id="";
			String pw="";
		try {
			
			pro = new Properties();
			fis = new FileInputStream("c:\\javaworks\\workspace\\javaBegin\\src\\jdbc.properties");
			pro.load(fis);
			
			driver = pro.getProperty("driver");
			url = pro.getProperty("dbURL");
			id = pro.getProperty("dbID");
			pw = pro.getProperty("dbPW");
			
				Class.forName(driver);
				
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
			return DriverManager.getConnection(url, id, pw);
	}
}
