package db;

import java.sql.*;

public class CRUDexam {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String dbURL  = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID   = "test";
		String dbPW   = "1111";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs   = null;

		String query = "";
		String selectAll = "SELECT * FROM t_member";
		String select = "SELECT * FROM t_member WHERE ~~~";
		String update = "UPDATE t_member SET ~~~";
		String delete = "DELETE FROM t_member WHERE ~~~";
		String insert = "INSERT INTO t_member VALUES~~~";
		
		
		//JDBC 연결 작업 처리
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbURL, dbID, dbPW); 
			stmt = con.createStatement();
			
			//사용자 데이터 추가하는 쿼리를 query에 저장
			//id 	: ccc	
			//pw 	: 3333
			//이름 	: 사용자3
			//주소 	: 부산
			//no 	: 시퀀스를 이용하여 입력
			//가입일 	: 오늘 날짜 (시스템 정보 이용)
			query = "INSERT INTO t_member " +
					"VALUES('ccc','3333','사용자3','부산'," +
					"       t_member_seq.NEXTVAL, SYSDATE)";
			
			//쿼리문 실행 후 데이터 추가 성공인 경우
			//화면에 쿼리 실행 성공 메시지 출력 
			stmt.executeUpdate(query);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
