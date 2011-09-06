package db.main;
import java.io.*;
import java.sql.*;
import java.util.*;

import db.dao.DB_Connect;
import db.dao.UserDAO;
import db.vo.UserVO;
public class UserMain {
	

	public static void main(String[] args) {
	Login log = new Login();
	UserDAO dao = new UserDAO();
	UserVO vo = new UserVO();
	int result=0;
	String done = "작업 처리 실패";
	InputStream is = System.in;
	int input = 0;
	
	log.Login();
	
	
	System.out.println("=========회원 관리 시스템=========");
	System.out.println("1.입력  2.조회  3.수정  4.삭제  5.종료");
	System.out.println("=>");
	
	try {
		while(	 (input=is.read()) !=-1 ){
			switch((char)input){
			case '1' :	result = dao.insert(vo); 
				if(result <0)System.out.println(done);	break;
			
			case '2' : 	Vector<UserVO> s = dao.select();
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
			done = "조회완료 "; break;
				
			case '3' :	result = dao.update(vo);	
						if(result <0)System.out.println(done);break;
			case '4' :	result = dao.delete(vo); 
						if(result <0){System.out.println(done);}break;
			case '5' :	System.out.println("종료합니다.");
								System.exit(0); break;
			}
			if (input==13||input==10)		continue;
			if (input=='6')	break;
			
			System.out.println("1.입력  2.조회  3.수정  4.삭제  5.종료");
			System.out.println("=>");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	

}
