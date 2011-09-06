package db.dao;

import java.io.*;
import java.sql.*;
import java.util.*;

import db.vo.UserVO;

public class UserDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	String query;
	
	int result;
	
	BufferedReader br;
	
	UserVO vo;
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int insert(UserVO vo){
		
		
		//문자열 입력받기
		br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		try {
			while(br.readLine() != null){
				System.out.print("id:");
				String userid = br.readLine();
	
				System.out.print("pass:");
				String userpw = br.readLine();
				
	
				System.out.print("name:");
				String usernm = br.readLine();
	
				System.out.print("address:");
				String address = br.readLine();
				
				//데이터 삽입
	
	
				query = "insert into t_member values (?,?,?,?,t_member_seq.nextval,SYSDATE)";
				
				
				//스테이트먼트 객체 생성
				con = DBconnect.getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, userid);
				pstmt.setString(2, userpw);
				pstmt.setString(3, usernm);
				pstmt.setString(4, address);
				result = pstmt.executeUpdate();
				
				 
				
				if (result > 0){
					System.out.println(result + "개 행 삽입 성공");
				}else{
					System.out.println(result + "개 행 삽입. ....  insert 실패.");
				}
				break;
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				if (br != null) br.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return result;
	}//insert
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int delete(UserVO vo){
		System.out.println("삭제할 회원의 아이디를 입력하세요. ");
		System.out.println("id:");
		
		try {
			//문자열 입력받기
			br = new BufferedReader(new InputStreamReader(System.in)) ;
			String userid = br.readLine();
		
			if ((userid= br.readLine()) != null){
			
			

				query = "delete from t_member where userid=?";
			

				con = DBconnect.getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, userid);
				result = pstmt.executeUpdate();
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				if (br != null) br.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return result;
				
	}
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int update(UserVO vo){
		
		String field = null ;
		String fieldValue = null ;

		String userid ;
		
		
		Iterator<UserVO> it = select().iterator();

		while(it.hasNext()){
			vo = it.next();
			System.out.println(vo.getUserid()+"\t"+ vo.getUserpw() +"\t"+ vo.getUsernm()+"\t"+ vo.getAddress());
		}
	


				

		try {
			
			System.out.println("변경할 회원의 아이디를 입력하세요. ");

			//문자열 입력받기
			br = new BufferedReader(new InputStreamReader(System.in)) ;
			if (br.readLine()!= null)
				System.out.print("id:");
				userid = br.readLine();
				
				
			System.out.println("수정하실 항목을 선택하세요.");
			System.out.println("1.아이디\t2.비번\t3.이름\t4.주소");
			System.out.println("-->");
			String num; 
//			num = br.readLine();
//
//			switch (Integer.parseInt(num)){
//				case 1:
//					System.out.print("아이디-->");	
//					field = "userid";
//					fieldValue = br.readLine();
//					break;
//				case 2:
//					System.out.print("비밀번호-->");	
//					field = "userpw";
//					fieldValue = br.readLine();
//					break;
//				case 3:
//						System.out.print("이름-->");	
//						field = "usernm";			
//						fieldValue = br.readLine();				
//						break;
//				case 4:
//					System.out.print("주소-->");	
//					field = "address";	
//					fieldValue = br.readLine();						
//					break;
//				default :
//					break ;
//				}//switch
//			
//			query = "update t_member set " + field + "=? where userid='"+userid+"'";
//			con = DBconnect.getConnection();
//			pstmt = con.prepareStatement(query);
//			pstmt.setString(1, fieldValue);
//			result = pstmt.executeUpdate();
//			
//						
//			
//	
//		} catch (SQLException e) {
//			// TODO Auto-generated catch blocke
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				if (br != null) br.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

			
		
		return result;
		
	}
	
	
	
	public Vector<UserVO> select() {
		Vector<UserVO> selectResult = new Vector<UserVO>();
		
		try {
			
			
			
			con = DBconnect.getConnection();
			query = "select * from T_MEMBER";//select query
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();

			while(rs.next()){
				
				//데이터 담을 vo 객체
				vo = new UserVO();
				
				//vo에 담기
				vo.setUserid(rs.getString("userid"));
				vo.setUserpw(rs.getString("userpw"));
				vo.setUsernm(rs.getString("usernm"));
				vo.setAddress(rs.getString("address"));
				vo.setUserno(rs.getInt("no"));
				vo.setRegDate(rs.getDate("reg_DATE"));
				
				selectResult.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				if (br != null) br.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return selectResult;
			
	}//method

	
	public Vector<UserVO> select(String s) {
		Vector<UserVO> selectResult = new Vector<UserVO>();
		
		try {
			
			
			
			con = DBconnect.getConnection();
			query = "select * from T_MEMBER where userid=?";//select query
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, s);
			rs = pstmt.executeQuery();

			while(rs.next()){
				
				//데이터 담을 vo 객체
				vo = new UserVO();
				
				//vo에 담기
				vo.setUserid(rs.getString("userid"));
				vo.setUserpw(rs.getString("userpw"));
				vo.setUsernm(rs.getString("usernm"));
				vo.setAddress(rs.getString("address"));
				vo.setUserno(rs.getInt("no"));
				vo.setRegDate(rs.getDate("reg_DATE"));
				
				selectResult.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				if (br != null) br.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return selectResult;
			
	}//method


	
	public Vector<UserVO> select(String id, String pw) {
		Vector<UserVO> selectResult = new Vector<UserVO>();
		
		try {
			
			
			
			con = DBconnect.getConnection();
			query = "select * from T_MEMBER where userid=? and userpw=?";//select query
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			while(rs.next()){
				
				//데이터 담을 vo 객체
				vo = new UserVO();
				
				//vo에 담기
				vo.setUserid(rs.getString("userid"));
				vo.setUserpw(rs.getString("userpw"));
				vo.setUsernm(rs.getString("usernm"));
				vo.setAddress(rs.getString("address"));
				vo.setUserno(rs.getInt("no"));
				vo.setRegDate(rs.getDate("reg_DATE"));
				
				selectResult.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				if (br != null) br.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return selectResult;
			
	}//method

	
}//class
