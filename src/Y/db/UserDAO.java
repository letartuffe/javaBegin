package db.dao;

import java.io.*;
import java.sql.*;
import java.util.*;

import db.main.UserMain;
import db.vo.UserVO;
public class UserDAO {
	Connection con ;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;
	int result;
	BufferedReader br;
	UserVO vo;

	
	public int insert(UserVO vo){
		try{
			con = DB_Connect.getConnection();
			br = new BufferedReader( new InputStreamReader(System.in));
				System.out.println("입력해주세요.");
			if(br.readLine() != null ){
				System.out.print("id : ");
				String userid = br.readLine();
				
				System.out.print("pass : ");
				String userpw = br.readLine();
				
				System.out.print("name : ");
				String usernm = br.readLine();
				
				System.out.print("address : ");
				String address = br.readLine();
			
				String insert = "INSERT INTO t_member values(?,?,?,?, t_member_seq.nextval, SYSDATE)" ;
				pstmt = con.prepareStatement(insert);
				pstmt.setString(1, userid);
				pstmt.setString(2, userpw);
				pstmt.setString(3, usernm);
				pstmt.setString(4, address);
				int ins = pstmt.executeUpdate();
				if (ins >0){System.out.println("사용자 입력이 완료되었습니다.");}
			}
		} catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Null;"+e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {	if(con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return 0;
	}
	
	public Vector<UserVO> select(){
			
			query = "SELECT * FROM t_member";
			Vector<UserVO> vec = new Vector<UserVO>();
			System.out.println("사용자 조회를 시작합니다.");
				try {
					con = DB_Connect.getConnection();
					pstmt = con.prepareStatement(query);
					rs = pstmt.executeQuery();
				while(rs.next()){
					vo = new UserVO();
					vo.setUserno(rs.getInt("no"));
					vo.setUserid(rs.getString("userid"));
					vo.setUserpw(rs.getString("userpw"));
					vo.setUsernm(rs.getString("usernm"));
					vo.setAddress(rs.getString("address"));
					vo.setRegDate(rs.getString("reg_DATE"));
					vec.add(vo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return vec;
	}
	
	public int update(UserVO vo){
		
		Vector<UserVO> s = select();
		System.out.println(s.size()+"건 검색");
		System.out.println("No. \t ID \t 비밀번호 \t 이름 \t 주소 \t 가입일자");
		for(int i=0 ; i < s.size() ; i++){
			vo = s.get(i);
			System.out.print(vo.getUserid()+"\t");
			System.out.print(vo.getUserpw()+"\t");
			System.out.print(vo.getUsernm()+"\t");
			System.out.print(vo.getAddress()+"\t");
			System.out.print(vo.getUserno()+"\t");
			System.out.println(vo.getRegDate()+"\t");
			
		}
			
	
			try {	String ch = null;
					con = DB_Connect.getConnection();
					System.out.println("변경하실 아이디를 입력하세요");
					
					br = new BufferedReader( new InputStreamReader(System.in));
					
					if(br.readLine() != null )
					System.out.print("id : ");
					String userid = br.readLine();
					
						
						String find = "select * from T_MEMBER where userid=?";
						pstmt = con.prepareStatement(find);
						pstmt.setString(1, userid);
						rs = pstmt.executeQuery();			
					
					if(rs.next()==false){
						System.out.println("입력하신 아이디는 없습니다.");
						update(vo);}
					else{
					System.out.println("무엇을 변경하시겠습니까?");
					System.out.println("1.id   2.pass  3.name  4.address");
					ch = br.readLine();
					
					switch (Integer.parseInt(ch)){
					case(1) : ch="userid";	break;
					case(2) : ch="userpw";	break;
					case(3) : ch="usernm";	break;
					case(4) : ch="address";	break;
					default : {System.out.println("1~4까지만 입력해 주세요");
					update(vo);
					}
			}
					
					
			
			
			System.out.println("뭘로 변경할꺼뉘");
			
			
			String change = br.readLine();
			String update = "UPDATE t_member SET " + ch +" =?  WHERE userid='"+userid+"'";
			pstmt = con.prepareStatement(update);
			pstmt.setString(1, change);
			
			int upd = pstmt.executeUpdate();
			if (upd >0){System.out.println("수정이 완료되었습니다.");}
	
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		return 0;
	}
	
	public int delete(UserVO vo){
	
	Vector<UserVO> s = select();
	System.out.println(s.size()+"건 검색");
	System.out.println("No. \t ID \t 비밀번호 \t 이름 \t 주소 \t 가입일자");
	for(int i=0 ; i < s.size() ; i++){
		vo = s.get(i);
		System.out.print(vo.getUserid()+"\t");
		System.out.print(vo.getUserpw()+"\t");
		System.out.print(vo.getUsernm()+"\t");
		System.out.print(vo.getAddress()+"\t");
		System.out.print(vo.getUserno()+"\t");
		System.out.println(vo.getRegDate()+"\t");
	}
		try {
				con = DB_Connect.getConnection();
				vo = new UserVO();
				System.out.println("삭제하실 아이디를 입력하시오");
			
				br = new BufferedReader( new InputStreamReader(System.in)); 
				if(br.readLine() != null )
				System.out.print("id : ");
				String userid = br.readLine();
				
				String find = "select * from T_MEMBER where userid=?";
				pstmt = con.prepareStatement(find);
				pstmt.setString(1, userid);
				rs = pstmt.executeQuery();			
			
			if(rs.next()==false){
				System.out.println("입력하신 아이디는 없습니다.");
				delete(vo);}
				
			else{	
				String delete = "DELETE FROM t_member WHERE userid=?";
				pstmt = con.prepareStatement(delete);
				pstmt.setString(1, userid);
				int del = pstmt.executeUpdate();
				if (del >0){System.out.println(userid+"가 삭제되었습니다.");}
			}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		return 0;
	
	}
}
