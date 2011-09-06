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
		
		
		//JDBC ���� �۾� ó��
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbURL, dbID, dbPW); 
			stmt = con.createStatement();
			
			//����� ������ �߰��ϴ� ������ query�� ����
			//id 	: ccc	
			//pw 	: 3333
			//�̸� 	: �����3
			//�ּ� 	: �λ�
			//no 	: �������� �̿��Ͽ� �Է�
			//������ 	: ���� ��¥ (�ý��� ���� �̿�)
			query = "INSERT INTO t_member " +
					"VALUES('ccc','3333','�����3','�λ�'," +
					"       t_member_seq.NEXTVAL, SYSDATE)";
			
			//������ ���� �� ������ �߰� ������ ���
			//ȭ�鿡 ���� ���� ���� �޽��� ��� 
			stmt.executeUpdate(query);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
