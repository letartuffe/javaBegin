package db;

//1.sql패키지 임포트
import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String dbURL  = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID   = "test";
		String dbPW   = "1111";
				
		try {
			//2.드라이버 로드
			Class.forName(driver);
			
			//3.커넥션 객체를 생성
			Connection con = DriverManager.getConnection(
							   dbURL, dbID, dbPW); 
			//4.스테이트먼트 객체 생성
			Statement stmt = con.createStatement();
			
			//5.query문 작성
			String query = "SELECT * FROM t_member";
			
			//6.query문 실행
			ResultSet rs = stmt.executeQuery(query);
			
			//7.query 실행 결과 출력
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
