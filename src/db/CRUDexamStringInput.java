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
			
			
			//드라이버로드
			Class.forName(driver);
			
			//커넥션 객체를 생성
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC 드라이버 로딩 성공! \n 커낵션 객체 생성 성공");
			
			
			//스테이트먼트 객체 생성
			Statement stmt = con.createStatement();
			System.out.println("스테이트먼트 객체 생성 성공");

			
			
			String queryInsert = "insert into t_member values ('" + id
					+ "','" + pass + "','" + name + "','" + address + "',t_member_seq.nextval,SYSDATE)";
			
			

			//데이터 삽입
			int ins = stmt.executeUpdate(queryInsert);
			
			if (ins > 0){
				System.out.println(ins + "개 행 삽입 성공");
			}else{
				System.out.println(ins + "개 행 삽입. ....  insert 실패.");
			}
			
				
	
			//query문 실행
			ResultSet rs = stmt.executeQuery(querySelectAll);
			
			//쿼리 실행 결과 출력
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
