package db.main;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Vector;

import db.dao.UserDAO;
import db.vo.UserVO;

public class UserMain {
	
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		UserVO vo = new UserVO();
		InputStream is = System.in;
		String done = "작업 처리 실패";
		int result = 0;
		int input = 0;
		
		System.out.println("======= 사용자 관리 시스템 =======");
		System.out.println("1.입력  2.조회  3.수정  4.삭제  5.종료");
		System.out.print("=> ");
		
		try {
			while( (input=is.read()) != -1){
				switch( (char)input){
					case '1' : result = dao.insert(vo);	
							   if(result>0) 
								  done = "==> 사용자 입력 성공";  break;
					case '2' : Vector<UserVO> vec = dao.select();	
							   //벡터를 받아서 화면에 출력
							   System.out.println("No.\t ID\t 비밀번호\t 이름\t 주소\t 가입일자");
							   for(int i=0 ; i<vec.size() ; i++){
								   vo = vec.get(i);
								   System.out.print(vo.getUserno() + "\t ");
								   System.out.print(vo.getUserid() + "\t ");
								   System.out.print(vo.getUserpw() + "\t ");
								   System.out.print(vo.getUsernm() + "\t ");
								   System.out.print(vo.getAddress() + "\t ");
								   System.out.println(vo.getRegDate());
							   }
					
							   done = "==> 조회 완료";		  break;
					case '3' : result = dao.update(vo);		
							   if(result>0) 
								   done = "==> 데이터 변경 성공"; break;
					case '4' : result = dao.delete(vo);		
							   if(result>0) 
								   done = "==> 사용자 삭제 성공"; break;
					case '5' : System.out.println(
							   "---- THE END --");			  break;
				}				
				if( input==13 || input==10) continue;
				if( input=='5') 			break;				
				
				System.out.println(done);	//쿼리 실행 결과 메시지 출력
				System.out.println("1.입력  2.조회  3.수정  4.삭제  5.종료");
				System.out.print("=> ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(is!=null) 	is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}








