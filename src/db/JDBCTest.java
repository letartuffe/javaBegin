package db;

//sql 패키지 임포트

import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "test";
		String dbPW = "1111";
		
		try {
			
			//드라이버로드
			Class.forName(driver);
			
			//커넥션 객체를 생성
			Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC 드라이버 로딩 성공! \n 커낵션 객체 생성 성공");
			
			//스테이트먼트 객체 생성
			Statement stmt = con.createStatement();
			System.out.println("스테이트먼트 객체 생성 성공");
			
			String query = "select * from T_MEMBER";
			
			//sql문 작성.
			stmt.executeQuery(query);
			
			//query문 실행
			ResultSet rs = stmt.executeQuery(query);
			
			//쿼리 실행 결과 출력
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
