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
		String name = "������";
		String address ="����";
		
		PreparedStatement pstmt ;
		
		String queryInsert = "insert into t_member values (?,?,?,?,t_member_seq.nextval,SYSDATE)";
		
		
		//����̹��ε�
		try {
			Class.forName(driver);
			

			//Ŀ�ؼ� ��ü�� ����
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC ����̹� �ε� ����! \n Ŀ���� ��ü ���� ����");
			
			//������Ʈ��Ʈ ��ü ����
			pstmt = con.prepareStatement(queryInsert);
			System.out.println("����������Ʈ��Ʈ ��ü ���� ����");
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			pstmt.setString(3, name);
			pstmt.setString(4, address);
			
			
			//������ ����
			int ins = pstmt.executeUpdate();
			
			if (ins > 0){
				System.out.println(ins + "�� �� ���� ����");
			}else{
				System.out.println(ins + "�� �� ����. ....  insert ����.");
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
