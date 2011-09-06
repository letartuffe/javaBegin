package db;

import java.sql.*;

public class CRUDexam {
	
	
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbID = "test";
	static String dbPW = "1111";
	  
	
	
	public static void main(String[] args) {
		
		try {
			//test
			Connection con  ;
			//드라이버로드
			Class.forName(driver);
			
			//커넥션 객체를 생성
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC 드라이버 로딩 성공! \n 커낵션 객체 생성 성공");
			
			//스테이트먼트 객체 생성
			Statement stmt = con.createStatement();
			System.out.println("스테이트먼트 객체 생성 성공");
			
			//insert query
			String queryInsert = "insert into t_member values ('ccc','3333','사용자3','부산',t_member_seq.nextval,SYSDATE)";
			
			int ins = stmt.executeUpdate(queryInsert);
			
			if (ins > 0){
				System.out.println(ins + "개 행 삽입 성공");
			}else{
				System.out.println(ins + "개 행 삽입. ....  insert 실패.");
			}
			
				
	
			String querySelectAll = "select * from T_MEMBER";
			
			//sql문 작성.
			stmt.executeQuery(querySelectAll);
			
			//query문 실행
			ResultSet rs = stmt.executeQuery(querySelectAll);
			
			//쿼리 실행 결과 출력
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
			String queryUpdate = "update t_member set REG_DATE=SYSDATE-1 where userid='aaa'";
			
			
			ins = stmt.executeUpdate(queryUpdate);
			
			if (ins > 0){
				System.out.println(ins + "개 행  수정 성공");
			}else{
				System.out.println(ins + "개 행 삽입. ....  update 실패.");
			}
			
			
			
			
			String querySelectWhere = "select * from T_MEMBER where userid='aaa'";
			
			//sql문 작성.
			stmt.executeQuery(querySelectWhere);
			
			//query문 실행
			rs = stmt.executeQuery(querySelectWhere);
			
			//쿼리 실행 결과 출력
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
			
			String queryDelete = "delete from t_member where userid='ccc'";
			
			
			ins = stmt.executeUpdate(queryDelete);
			
			if (ins > 0){
				System.out.println(ins + "개 행  삭제  성공");
			}else{
				System.out.println(ins + "개 행 삭제 . ....  delete 실패.");
			}
			
			
			//query문 실행
			rs = stmt.executeQuery(querySelectAll);
			
			//쿼리 실행 결과 출력
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
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
