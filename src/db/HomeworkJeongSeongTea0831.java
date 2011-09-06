package db;

import java.sql.*;

public class HomeworkJeongSeongTea0831 {
	
	
	
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "test";
		String dbPW = "1111";
		
		String id ="rollback";
		String pass = "4444";
		String name = "정성태";
		String address ="서울";

		Connection con = null  ;
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		
		
		try {

			//드라이버로드
			Class.forName(driver);
			
			//커넥션 객체를 생성
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			con.setAutoCommit(true);
			
			System.out.println("JDBC 드라이버 로딩 성공! \n 커낵션 객체 생성 성공");
			
			
			//insert query
			String queryInsert = "insert into t_member values (?,?,?,?,t_member_seq.nextval,SYSDATE)";
			
			
			//프리페어스테이트먼트 객체 생성
			pstmt = con.prepareStatement(queryInsert);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			pstmt.setString(3, name);
			pstmt.setString(4, address);
			
			System.out.println("프리페어스테이트먼트 객체 생성 성공");
			
			
			int ins = pstmt.executeUpdate();
			
			if (ins > 0){
				System.out.println(ins + "개 행 삽입 성공");
			}else{
				System.out.println(ins + "개 행 삽입. ....  insert 실패.");
			}
			
				
	
			String querySelectAll = "select * from T_MEMBER";
			
			pstmt = con.prepareStatement(querySelectAll);
		
			rs = pstmt.executeQuery();
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}

				
			String queryUpdate = "update t_member set REG_DATE=SYSDATE-1 where userid=?";
			
			
			pstmt = con.prepareStatement(queryUpdate);
			pstmt.setString(1, id);
			ins = pstmt.executeUpdate();
			
			if (ins > 0){
				System.out.println(ins + "개 행  수정 성공");
			}else{
				System.out.println(ins + "개 행 삽입. ....  update 실패.");
			}
			
			
			
			
			String querySelectWhere = "select * from T_MEMBER where userid=?";
			
			pstmt = con.prepareStatement(querySelectWhere);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
	
			String queryDelete = "delete from t_member where userid=?";
			
			
			pstmt = con.prepareStatement(queryDelete);
			pstmt.setString(1, id);
			ins = pstmt.executeUpdate();
			
			if (ins > 0){
				System.out.println(ins + "개 행  삭제  성공");
			}else{
				System.out.println(ins + "개 행 삭제 . ....  delete 실패.");
			}
			
			
			pstmt = con.prepareStatement(querySelectAll);
			
			rs = pstmt.executeQuery();
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				con.rollback(); //con.commit()으로 하면 결과 반영
				System.out.println("롤백 했음");
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
				
	}

}
