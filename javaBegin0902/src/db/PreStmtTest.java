package db;

import java.sql.*;

public class PreStmtTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String dbURL  = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID   = "test";
		String dbPW   = "1111";
		
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs   = null;
		
		String userid = "xxxxxxxxxx";
		String userpw = "5555";
		String usernm = "사용자5";
		String address = "울릉도";
		
		String insertPre = "INSERT INTO t_member " +
						   "VALUES(?, ?, ?, ?," +
						   "       t_member_seq.NEXTVAL, " +
						   "	   SYSDATE)";
		
		
		String insert = "INSERT INTO t_member " +
						"VALUES('ccc','3333','사용자3','부산'," +
							"       t_member_seq.NEXTVAL, SYSDATE)";
	
		insert = "INSERT INTO t_member "+
				 "VALUES('" + userid + "',"+
				 "	     '" + userpw + "',"+
				 "		 '" + usernm + "',"+
				 " 		 '" + address+ "',"+
				 "       t_member_seq.NEXTVAL, SYSDATE)";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbURL, dbID, dbPW); 
			
			//트랜잭션 제어
			con.setAutoCommit(false);
			
			stmt = con.createStatement();
			stmt.executeUpdate(insert);
			//PreparedStatement를 이용한 insert
			pstmt = con.prepareStatement(insertPre);
			pstmt.setString(1, userid);
			pstmt.setString(2, userpw);
			pstmt.setString(3, usernm);
			pstmt.setString(4, address);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			try {if(rs != null) 	 rs.close();
			 	 if(pstmt != null) pstmt.close();
				 if(stmt != null) stmt.close();
				 if(con != null)  con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}  
		} 
	}

}
