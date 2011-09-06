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
			//����̹��ε�
			Class.forName(driver);
			
			//Ŀ�ؼ� ��ü�� ����
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC ����̹� �ε� ����! \n Ŀ���� ��ü ���� ����");
			
			//������Ʈ��Ʈ ��ü ����
			Statement stmt = con.createStatement();
			System.out.println("������Ʈ��Ʈ ��ü ���� ����");
			
			//insert query
			String queryInsert = "insert into t_member values ('ccc','3333','�����3','�λ�',t_member_seq.nextval,SYSDATE)";
			
			int ins = stmt.executeUpdate(queryInsert);
			
			if (ins > 0){
				System.out.println(ins + "�� �� ���� ����");
			}else{
				System.out.println(ins + "�� �� ����. ....  insert ����.");
			}
			
				
	
			String querySelectAll = "select * from T_MEMBER";
			
			//sql�� �ۼ�.
			stmt.executeQuery(querySelectAll);
			
			//query�� ����
			ResultSet rs = stmt.executeQuery(querySelectAll);
			
			//���� ���� ��� ���
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
			String queryUpdate = "update t_member set REG_DATE=SYSDATE-1 where userid='aaa'";
			
			
			ins = stmt.executeUpdate(queryUpdate);
			
			if (ins > 0){
				System.out.println(ins + "�� ��  ���� ����");
			}else{
				System.out.println(ins + "�� �� ����. ....  update ����.");
			}
			
			
			
			
			String querySelectWhere = "select * from T_MEMBER where userid='aaa'";
			
			//sql�� �ۼ�.
			stmt.executeQuery(querySelectWhere);
			
			//query�� ����
			rs = stmt.executeQuery(querySelectWhere);
			
			//���� ���� ��� ���
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
			
			String queryDelete = "delete from t_member where userid='ccc'";
			
			
			ins = stmt.executeUpdate(queryDelete);
			
			if (ins > 0){
				System.out.println(ins + "�� ��  ����  ����");
			}else{
				System.out.println(ins + "�� �� ���� . ....  delete ����.");
			}
			
			
			//query�� ����
			rs = stmt.executeQuery(querySelectAll);
			
			//���� ���� ��� ���
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
