package db.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBconnect {
	
	static Connection getConnection(){
		Connection con = null;
		try {
			FileInputStream fis = new FileInputStream("src\\db\\jdbc.properties");
			Properties pro = new Properties();
			pro.load(fis);
			
			String driver = pro.getProperty("driver");
			String url =  pro.getProperty("dbURL");
			String id  =  pro.getProperty("dbID");
			String pw  =  pro.getProperty("dbPW");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
