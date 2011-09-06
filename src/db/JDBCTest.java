package db;

//sql ��Ű�� ����Ʈ

import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "test";
		String dbPW = "1111";
		
		try {
			
			//����̹��ε�
			Class.forName(driver);
			
			//Ŀ�ؼ� ��ü�� ����
			Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC ����̹� �ε� ����! \n Ŀ���� ��ü ���� ����");
			
			//������Ʈ��Ʈ ��ü ����
			Statement stmt = con.createStatement();
			System.out.println("������Ʈ��Ʈ ��ü ���� ����");
			
			String query = "select * from T_MEMBER";
			
			//sql�� �ۼ�.
			stmt.executeQuery(query);
			
			//query�� ����
			ResultSet rs = stmt.executeQuery(query);
			
			//���� ���� ��� ���
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm"));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
