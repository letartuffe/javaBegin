package db;

import java.io.*;
import java.sql.*;


public class CRUDexamStringInput {
	
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbID = "test";
	static String dbPW = "1111";
	
	static Connection con = null ;
	
	public static void main(String[] args) {
		String id ="";
		String pass = "";
		String name = "";
		String address ="";
		
		
		String querySelectAll = "select * from T_MEMBER";//select query

		
				
		try {
			
			Reader r = new InputStreamReader(System.in); ;
			BufferedReader br = new BufferedReader(r) ;
			
			
			System.out.println("id:");
			id = br.readLine();
			

			System.out.println("pass:");
			pass = br.readLine();
			

			System.out.println("name:");
			name = br.readLine();
			

			System.out.println("address:");
			address = br.readLine();
			
			
			//����̹��ε�
			Class.forName(driver);
			
			//Ŀ�ؼ� ��ü�� ����
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC ����̹� �ε� ����! \n Ŀ���� ��ü ���� ����");
			
			
			//������Ʈ��Ʈ ��ü ����
			Statement stmt = con.createStatement();
			System.out.println("������Ʈ��Ʈ ��ü ���� ����");

			
			
			String queryInsert = "insert into t_member values ('" + id
					+ "','" + pass + "','" + name + "','" + address + "',t_member_seq.nextval,SYSDATE)";
			
			

			//������ ����
			int ins = stmt.executeUpdate(queryInsert);
			
			if (ins > 0){
				System.out.println(ins + "�� �� ���� ����");
			}else{
				System.out.println(ins + "�� �� ����. ....  insert ����.");
			}
			
				
	
			//query�� ����
			ResultSet rs = stmt.executeQuery(querySelectAll);
			
			//���� ���� ��� ���
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		
	}

}
