package db;

import java.io.*;
import java.sql.*;


public class CopyOfCRUDexamStringInputVer2 {
	
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
		ResultSet rs ;
		int checkNum ;
				
		try {
			//드라이버로드
			Class.forName(driver);
			
			//커넥션 객체를 생성
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC 드라이버 로딩 성공! \n 커낵션 객체 생성 성공");
			
			
			//스테이트먼트 객체 생성
			Statement stmt = con.createStatement();
			System.out.println("스테이트먼트 객체 생성 성공");
			
			
			//문자열 입력받기
			Reader r = new InputStreamReader(System.in); ;
			BufferedReader br = new BufferedReader(r) ;
			
			System.out.println("-------------회원 관리 시스템 -------------");
			System.out.println("1.입력\t2.조회\t3.변경\t4.삭제\t5.종료");
			System.out.print("-->");
			
			//insert,update 리턴값 변수 설정
			int ins = 0 ;
			
			
			switch(Integer.parseInt(br.readLine())){
				case 1:

					System.out.println("id:");
					id = br.readLine();
					

					System.out.println("pass:");
					pass = br.readLine();
					

					System.out.println("name:");
					name = br.readLine();
					

					System.out.println("address:");
					address = br.readLine();
					
					//데이터 삽입


					String queryInsert = "insert into t_member values ('" + id
							+ "','" + pass + "','" + name + "','" + address + "',t_member_seq.nextval,SYSDATE)";
					
					ins = stmt.executeUpdate(queryInsert);
					
					if (ins > 0){
						System.out.println(ins + "개 행 삽입 성공");
					}else{
						System.out.println(ins + "개 행 삽입. ....  insert 실패.");
					}
					
					
					break;
				case 2:
					//query문 실행
					rs = stmt.executeQuery(querySelectAll);
					
					//쿼리 실행 결과 출력
					while(rs.next() ){
						System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
					}
					
					break;
				case 3:  
					//
					
					//query문 실행
					rs = stmt.executeQuery(querySelectAll);
					//쿼리 실행 결과 출력
					while(rs.next() ){
						System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
					}
					
					System.out.println("변경할 회원의 아이디를 입력하세요. ");
					
					System.out.println("id:");
					id = br.readLine();
						
					
					//query문 실행
					rs = stmt.executeQuery(querySelectAll);
					if (rs.next() != false){
						System.out.println("수정하실  항목을 선택해주세요.");
						System.out.println("1. 비밀번호\t2.이름\t3.주소");
						System.out.println("-->");
						
						String field = null ;
						String fieldValue = null ;
						
						while ((checkNum = Integer.parseInt(br.readLine())) != -1){
							switch(checkNum){
								case 1:
									System.out.println("비밀번호-->");	
									field = "userpw";
									fieldValue = br.readLine();
									break;
								case 2:
									System.out.println("이름-->");	
									field = "usernm";			
									fieldValue = br.readLine();				
									break;
								case 3:
									System.out.println("주소-->");	
									field = "address";	
									fieldValue = br.readLine();						
									break;
							}//switch

							if (checkNum != 1 ||checkNum != 2 ||checkNum != 3) break;
							
							System.out.println("1. 비밀번호\t2.이름\t3.주소");
							System.out.print("-->");	
							
						}//while
						
						String queryUpdate = "update t_member set "+ field +"='"+fieldValue+"' where userid='"+id+"'";
						
						ins = stmt.executeUpdate(queryUpdate);
						
						if (ins > 0){
							System.out.println(ins + "개 행 수정 성공");
						}else{
							System.out.println(ins + "개 행 수정. ....  update 실패.");
						}
						
						querySelectAll = querySelectAll + " where userid='"+id+"'";		
						
						//query문 실행
						rs = stmt.executeQuery(querySelectAll);
						//쿼리 실행 결과 출력
						while(rs.next() ){
							System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
						}
						
					}else {
						System.out.println("일치하는 아이디가 없어요.");
						break;
					}
					
					
					
//					
//
//					System.out.println("pass:");
//					pass = br.readLine();
//					
//
//					System.out.println("name:");
//					name = br.readLine();
//					
//
//					System.out.println("address:");
//					address = br.readLine();
					
					
					
					break;
				case 4:

					System.out.println("삭제할 회원의 아이디를 입력하세요. ");
					System.out.println("id:");
					id = br.readLine();
					String queryDelete = "delete from t_member where userid='" + id + "'";
					
					
					ins = stmt.executeUpdate(queryDelete);
					
					if (ins > 0){
						System.out.println(ins + "개 행  삭제  성공");
					}else{
						System.out.println(ins + "개 행 삭제 . ....  delete 실패.");
					}
					break;
				case 5:
					System.out.println("종료 합니다.");
					System.exit(0);
					break;
				default :
					System.out.println("1~5까지만.....");					
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
