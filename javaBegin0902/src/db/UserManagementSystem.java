package db;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class UserManagementSystem {
	private static String userid;
	private static String userpw;
	private static String usernm;
	private static String address;
	
	static Connection con;
	static PreparedStatement pstmt;
	static ResultSet rs;
	static BufferedReader br;
	
	static String query;
	static int result;
	static String done;
	
	//DB연결을 생성자에서 처리
	public UserManagementSystem(){
		FileInputStream fis;
		Properties pro;
		String file = "src\\db\\jdbc.properties";
		
		try {
			fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
			
			String driver = pro.getProperty("driver");
			String url =  pro.getProperty("dbURL");
			String id  =  pro.getProperty("dbID");
			String pw  =  pro.getProperty("dbPW");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UserManagementSystem();
		
		InputStream is = System.in;
		int input = 0;
		System.out.println("======= 사용자 관리 시스템 =======");
		System.out.println("1.입력  2.조회  3.수정  4.삭제  5.종료");
		System.out.print("=> ");
		
		try {
			while( (input=is.read()) != -1){
				switch( (char)input){
					case '1' : insert();	break;
					case '2' : select();	break;
					case '3' : modify();	break;
					case '4' : delete();	break;
					case '5' : System.out.println(
							   "---- THE END --");		
							   break;
				}				
				if( input==13 || input==10) continue;
				if( input=='5') 			break;
				
				System.out.println("1.입력  2.조회  3.수정  4.삭제  5.종료");
				System.out.print("=> ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(br!=null) 	br.close();
				if(rs!=null) 	rs.close();
				if(pstmt!=null)	pstmt.close();
				if(con!=null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//사용자 삭제 처리 메서드
	private static void delete() {
		System.out.println("=> 삭제하실 ID를 입력하세요.");
	}

	//사용자 정보 변경 처리 메서드
	private static void modify() {
		br = new BufferedReader(
				new InputStreamReader(
						System.in));
		System.out.println("=> 수정하실 ID를 입력하세요.");
		try {
			if( br.readLine() != null ){
				System.out.print(":: 아이디 : ");
				userid = br.readLine();
				
				System.out.println(":: 수정 항목 선택");
				System.out.println("::1.비밀번호"+
								   "  2.이름"+
								   "  3.주소");
				String no = br.readLine();				
				StringBuffer sb;
				sb = new StringBuffer("UPDATE t_member SET ");
				
				if(no.equals("1")){
					System.out.print("::변경할 비밀번호 :");
					sb.append("userpw = '" + br.readLine() + "'" );
				}else if(no.equals("2")){
					System.out.print("::변경할 이름 :");
					sb.append("usernm = '" + br.readLine() + "'" );
				}else if(no.equals("3")){
					System.out.print("::변경할 주소 :");
					sb.append("address = '" + br.readLine() + "'" );
				}else{
					System.out.println("1~3 중에입력!!");
				}
				sb.append(" WHERE userid='");
				sb.append(userid);
				sb.append("'");
				
				query = sb.toString();
				//update 쿼리 실행
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//사용자 정보 조회 처리 메서드
	private static void select() {
		System.out.println("=> 사용자 조회를 시작합니다.");
		
	}

	//사용자 입력 쿼리 실행 메서드
	private static void insert() {
		br = new BufferedReader(
				new InputStreamReader(
						System.in));
		System.out.println("=> 사용자 입력을 시작합니다.");
		
		try {
			if( br.readLine() != null ){
				System.out.print(":: 아이디 : ");
				userid = br.readLine();
				
				System.out.print(":: 비밀번호 : ");
				userpw = br.readLine();

				System.out.print(":: 이름 : ");
				usernm = br.readLine();

				System.out.print(":: 주소 : ");
				address = br.readLine();
				
			}
			
			//입력받은 데이터 DB에 입력 처리

			System.out.println("=> 사용자 입력 완료!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}











