package db;

//1.sql��Ű�� ����Ʈ
import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String dbURL  = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID   = "test";
		String dbPW   = "1111";
				
		try {
			//2.����̹� �ε�
			Class.forName(driver);
			
			//3.Ŀ�ؼ� ��ü�� ����
			Connection con = DriverManager.getConnection(
							   dbURL, dbID, dbPW); 
			//4.������Ʈ��Ʈ ��ü ����
			Statement stmt = con.createStatement();
			
			//5.query�� �ۼ�
			String query = "SELECT * FROM t_member";
			
			//6.query�� ����
			ResultSet rs = stmt.executeQuery(query);
			
			//7.query ���� ��� ���
			while(rs.next()){
				System.out.println(rs.getString("userid") + " : "+
								   rs.getString("userpw") + " : "+
								   rs.getString("usernm")  );
			}
			
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
