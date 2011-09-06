package db.dao;

import java.sql.*;
import java.util.Vector;
import java.io.*;

import db.vo.UserVO;

public class UserDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;
	int result;
	BufferedReader br;
	UserVO vo;
	
	public int insert(UserVO vo){
		return result;
	}
	public int delete(UserVO vo){
		return result;
	}
	public int update(UserVO vo){
		return result;
	}
	
	public Vector<UserVO> select(){
		con = DBconnect.getConnection();
		query = "SELECT * FROM t_member";
		Vector<UserVO> vec = new Vector<UserVO>();
		System.out.println("=> 사용자 조회를 시작합니다.");
		try {
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()){
				vo = new UserVO();
				vo.setUserno(rs.getInt("no"));
				vo.setUserid(rs.getString("userid"));
				vo.setUserpw(rs.getString("userpw"));
				vo.setUsernm(rs.getString("usernm"));
				vo.setAddress(rs.getString("address"));
				vo.setRegDate(rs.getString("reg_date"));
				
				vec.add(vo);//vo를 벡터에 담기
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//벡터를 리턴
		return vec;
	}
	
}












