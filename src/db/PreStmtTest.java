package db;

import java.sql.*;

public class PreStmtTest {
	
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbID = "test";
	static String dbPW = "1111";
	static Connection con = null ;

	public static void main(String[] args) {
		
		String id ="eee";
		String pass = "4444";
		String name = "정성태";
		String address ="서울";
		
		PreparedStatement pstmt ;
		
		String queryInsert = "insert into t_member values (?,?,?,?,t_member_seq.nextval,SYSDATE)";
		
		
		//드라이버로드
		try {
			Class.forName(driver);
			

			//커넥션 객체를 생성
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC 드라이버 로딩 성공! \n 커낵션 객체 생성 성공");
			
			//스테이트먼트 객체 생성
			pstmt = con.prepareStatement(queryInsert);
			System.out.println("프리페어스테이트먼트 객체 생성 성공");
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			pstmt.setString(3, name);
			pstmt.setString(4, address);
			
			
			//데이터 삽입
			int ins = pstmt.executeUpdate();
			
			if (ins > 0){
				System.out.println(ins + "개 행 삽입 성공");
			}else{
				System.out.println(ins + "개 행 삽입. ....  insert 실패.");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
