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
		
		
		//���ڿ� �Է¹ޱ�
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
				
				//������ ����
	
	
				query = "insert into t_member values (?,?,?,?,t_member_seq.nextval,SYSDATE)";
				
				
				//������Ʈ��Ʈ ��ü ����
				con = DBconnect.getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, userid);
				pstmt.setString(2, userpw);
				pstmt.setString(3, usernm);
				pstmt.setString(4, address);
				result = pstmt.executeUpdate();
				
				 
				
				if (result > 0){
					System.out.println(result + "�� �� ���� ����");
				}else{
					System.out.println(result + "�� �� ����. ....  insert ����.");
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
		System.out.println("������ ȸ���� ���̵� �Է��ϼ���. ");
		System.out.println("id:");
		
		try {
			//���ڿ� �Է¹ޱ�
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
			
			System.out.println("������ ȸ���� ���̵� �Է��ϼ���. ");

			//���ڿ� �Է¹ޱ�
			br = new BufferedReader(new InputStreamReader(System.in)) ;
			if (br.readLine()!= null)
				System.out.print("id:");
				userid = br.readLine();
				
				
			System.out.println("�����Ͻ� �׸��� �����ϼ���.");
			System.out.println("1.���̵�\t2.���\t3.�̸�\t4.�ּ�");
			System.out.println("-->");
			String num; 
//			num = br.readLine();
//
//			switch (Integer.parseInt(num)){
//				case 1:
//					System.out.print("���̵�-->");	
//					field = "userid";
//					fieldValue = br.readLine();
//					break;
//				case 2:
//					System.out.print("��й�ȣ-->");	
//					field = "userpw";
//					fieldValue = br.readLine();
//					break;
//				case 3:
//						System.out.print("�̸�-->");	
//						field = "usernm";			
//						fieldValue = br.readLine();				
//						break;
//				case 4:
//					System.out.print("�ּ�-->");	
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
				
				//������ ���� vo ��ü
				vo = new UserVO();
				
				//vo�� ���
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
				
				//������ ���� vo ��ü
				vo = new UserVO();
				
				//vo�� ���
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
				
				//������ ���� vo ��ü
				vo = new UserVO();
				
				//vo�� ���
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
