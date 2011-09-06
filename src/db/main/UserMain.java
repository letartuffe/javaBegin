package db.main;

import java.io.*;
import java.util.*;

import db.dao.DBconnect;
import db.dao.UserDAO;
import db.vo.UserVO;





public class UserMain {



	public static void main(String[] args) {
		
		UserDAO dao = new UserDAO();
		UserVO vo = new UserVO();
		int result;
		String done = "작업처리 실패";
		InputStream is ;
		int input;
		is = System.in;
		BufferedReader br;
		Vector<UserVO> select;
		UserVO temp1 = null ;

		
		try {
			//문자열 입력받기
			br = new BufferedReader(new InputStreamReader(System.in)) ;
			
			System.out.println("-------------회원 관리 시스템 -------------");
			
			System.out.println("로그인해주세요.");
			
			
			
			while(br.readLine() != null){
				System.out.print("id:");
				String userid = br.readLine();
			

				System.out.print("pass:");
				String userpw = br.readLine();
				
				Iterator<UserVO> it1 = dao.select(userid, userpw).iterator();
				if (it1.hasNext()){
					temp1 = it1.next();
					
					System.out.println("로그인 성공......"+temp1.getUsernm()+"님 로그인 하셨습니다.");
					System.out.println("-------------회원 관리 시스템 -------------");
					System.out.println("1.입력\t2.조회\t3.변경\t4.삭제\t5.종료");
					System.out.print("-->");

					while ((input = is.read()) != -1){
						switch((char)input){
							case '1': 
								result = dao.insert(vo);
								if(result < 0){
									System.out.println(done);
								}else{
									System.out.println(result+ "개 입력 성공"); 
								}
								break;
							case '2':
								Iterator<UserVO> it = dao.select().iterator();
								UserVO temp ; 
								
								if (it.hasNext()){

									while(it.hasNext()){
										temp = it.next();
										System.out.println(temp.getUserid()+"\t"+ temp.getUserpw() +"\t"+ temp.getUsernm()+"\t"+ temp.getAddress());
										
									}
									System.out.println(
											dao.select().size()+"건 검색 완료-------------------");
								}else{
									System.out.println("검색 결과 없음.");
								}						
								
								
								break;
							case '3': 
								result = dao.update(vo);
								if(result < 0){
									System.out.println(done);
								}else{
									System.out.println(result+ "개 수정 성공"); 
								}
								break; 
								
							case '4': 
								result = dao.delete(vo);
								if(result < 0){
									System.out.println(done);
								}else{
									System.out.println(result+ "개 삭제 성공"); 
								}
								break;
								
							case '5':
								
								System.out.println("------------시스템 종료-----------------");
								break;
							
							}//switch
						
						if (input == 13 || input == 10) continue;
						
						if (input == '5') break;
						
						System.out.println("1.입력\t2.조회\t3.변경\t4.삭제\t5.종료");
						System.out.print("-->");	
						
					}//while
				}else{
					System.out.println("아이디와 비밀번호 정보가 없어요.");
				}//if
				
			}//while
			
			

	
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if (is != null) is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	

}//class


 




