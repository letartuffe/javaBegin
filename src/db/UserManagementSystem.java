package db;

import java.io.*;
import java.sql.*;



public class UserManagementSystem {

	
	private static String userid = null;
	private static String userpw = null;
	private static String usernm = null;
	private static String address= null;
	
	static String query =null;		
	static String querySelectAll = "select * from T_MEMBER";//select query
	
	static Connection con = null  ;
	static PreparedStatement pstmt = null ;
	static ResultSet rs = null ;
	
	static BufferedReader br = null;
	
	static //insert,update 리턴값 변수 설정
	int ins = 0 ;

	public UserManagementSystem() {
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbID = "test";
			String dbPW = "1111";
			
			//드라이버로드
			Class.forName(driver);

			//커넥션 객체를 생성
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) {
		new UserManagementSystem();
		
		InputStream is = System.in;
		int input = 0 ;
	
		System.out.println("-------------회원 관리 시스템 -------------");
		System.out.println("1.입력\t2.조회\t3.변경\t4.삭제\t5.종료");
		System.out.print("-->");

		try {
			while ((input = is.read()) != -1){
				switch((char)input){
					case '1': input(); break;
					case '2': select(); break;
					case '3': modify(); break;
					case '4': delete(); break;
					case '5':
						System.out.println("------------시스템 종료-----------------");
						break;
					
				}//switch
				
				if (input == 13 || input == 10) continue;
				if (input == '5') break;
				
				System.out.println("1.입력\t2.조회\t3.변경\t4.삭제\t5.종료");
				System.out.print("-->");	
				
			}//while


	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		finally{
//			
//				try {
//					if (rs != null) rs.close();
//					if (pstmt != null) pstmt.close();
//					if (con != null) con.close();
//					
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			
//		}
		
	}

	private static void modify()  {
		
		String field = null ;
		String fieldValue = null ;
			
		
		//select();
		
		System.out.println("변경할 회원의 아이디를 입력하세요. ");
		
		System.out.print("id:");
		
		if ((userid = readlineM()) != null){
			
			
			rs = (ResultSet) selectRT(userid);
			//쿼리 실행 결과 출력
			//쿼리 실행 결과 출력

			try {
				
				if (rs.next() != false) {
					
					while(readlineM() != null ){
						System.out.println("수정하실 항목을 선택하세요.");
						System.out.println("1.아이디\t2.비번\t3.이름\t4.주소");
						

						switch (Integer.parseInt(readlineM())){
							case 1:
								System.out.print("아이디-->");	
								field = "userid";
								fieldValue = readlineM();
								break;
							case 2:
								System.out.print("비밀번호-->");	
								field = "userpw";
								fieldValue = readlineM();
								break;
							case 3:
									System.out.print("이름-->");	
									field = "usernm";			
									fieldValue = readlineM();				
									break;
							case 4:
								System.out.print("주소-->");	
								field = "address";	
								fieldValue = readlineM();						
								break;
							default :
								break ;
						}//switch
						
						String sql = "update t_member set " + field + "=? where userid='"+userid+"'";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, fieldValue);
						
						ins = pstmt.executeUpdate();
						
						if (ins > 0){
							System.out.println(ins + "개 행 수정 성공");
						}else{
							System.out.println(ins + "개 행 수정. ....  update 실패.");
						}
						break;
						
					}//while
				}else{
					System.out.println("");
					System.out.println("------------------------------------------------");
					System.out.println("입력하신 회원아이디가 없습니다.. ");
					modify();
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}//while
				
		
		
	}//modify

	private static void delete() {
		// TODO Auto-generated method stub
		
		System.out.println("삭제할 회원의 아이디를 입력하세요. ");
		System.out.println("id:");
		
		userid = readlineM();
		
		if ((userid = readlineM()) != null){
			
			

			String queryDelete = "delete from t_member where userid=?";
			
			try {
				pstmt = con.prepareStatement(queryDelete);
				pstmt.setString(1, userid);
				ins = pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (ins > 0){
				System.out.println(ins + "개 행  삭제  성공");
			}else{
				System.out.println(ins + "개 행 삭제 . ....  delete 실패.");
			}
		}
		
	}

	private static void select() {					
		
		//query문 실행
		try {
			querySelectAll = "select * from T_MEMBER";//select query
			pstmt = con.prepareStatement(querySelectAll);
			rs = pstmt.executeQuery();
			
			//쿼리 실행 결과 출력
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void selectid(String userid) {					

		
		//query문 실행
		try {
			
			querySelectAll = "select * from T_MEMBER where userid=?";
			pstmt = con.prepareStatement(querySelectAll);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			//쿼리 실행 결과 출력
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	private static Object selectRT(String userid) {					
		
		//query문 실행
		try {
			
			querySelectAll = "select * from T_MEMBER where userid=?";
			pstmt = con.prepareStatement(querySelectAll);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
			
	}

	private static void input() {
		//문자열 입력받기
		br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		try {
			while(br.readLine() != null){
				System.out.print("id:");
				userid = br.readLine();
	
				System.out.print("pass:");
				userpw = br.readLine();
				
	
				System.out.print("name:");
				usernm = br.readLine();
				
	
				System.out.print("address:");
				address = br.readLine();
				
				//데이터 삽입
	
	
				String queryInsert = "insert into t_member values (?,?,?,?,t_member_seq.nextval,SYSDATE)";
				
				
				//스테이트먼트 객체 생성
				pstmt = con.prepareStatement(queryInsert);
				pstmt.setString(1, userid);
				pstmt.setString(2, userpw);
				pstmt.setString(3, usernm);
				pstmt.setString(4, address);
				
				ins = pstmt.executeUpdate();
				
				if (ins > 0){
					System.out.println(ins + "개 행 삽입 성공");
				}else{
					System.out.println(ins + "개 행 삽입. ....  insert 실패.");
				}
				break;
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (ins > 0){
			System.out.println(ins + "개 행 삽입 성공");
		}else{
			System.out.println(ins + "개 행 삽입. ....  insert 실패.");
		}
		
	}

	private static String readlineM() {

		//문자열 입력받기
		br = new BufferedReader(new InputStreamReader(System.in)) ;
		String result = null ;
		try {
			if ((result=br.readLine()) != null){
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}

}
