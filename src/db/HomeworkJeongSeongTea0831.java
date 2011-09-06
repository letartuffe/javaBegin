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
		String name = "������";
		String address ="����";

		Connection con = null  ;
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		
		
		try {

			//����̹��ε�
			Class.forName(driver);
			
			//Ŀ�ؼ� ��ü�� ����
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			con.setAutoCommit(true);
			
			System.out.println("JDBC ����̹� �ε� ����! \n Ŀ���� ��ü ���� ����");
			
			
			//insert query
			String queryInsert = "insert into t_member values (?,?,?,?,t_member_seq.nextval,SYSDATE)";
			
			
			//����������Ʈ��Ʈ ��ü ����
			pstmt = con.prepareStatement(queryInsert);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			pstmt.setString(3, name);
			pstmt.setString(4, address);
			
			System.out.println("����������Ʈ��Ʈ ��ü ���� ����");
			
			
			int ins = pstmt.executeUpdate();
			
			if (ins > 0){
				System.out.println(ins + "�� �� ���� ����");
			}else{
				System.out.println(ins + "�� �� ����. ....  insert ����.");
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
				System.out.println(ins + "�� ��  ���� ����");
			}else{
				System.out.println(ins + "�� �� ����. ....  update ����.");
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
				System.out.println(ins + "�� ��  ����  ����");
			}else{
				System.out.println(ins + "�� �� ���� . ....  delete ����.");
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
				con.rollback(); //con.commit()���� �ϸ� ��� �ݿ�
				System.out.println("�ѹ� ����");
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
