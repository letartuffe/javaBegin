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
		String done = "�۾�ó�� ����";
		InputStream is ;
		int input;
		is = System.in;
		BufferedReader br;
		Vector<UserVO> select;
		UserVO temp1 = null ;

		
		try {
			//���ڿ� �Է¹ޱ�
			br = new BufferedReader(new InputStreamReader(System.in)) ;
			
			System.out.println("-------------ȸ�� ���� �ý��� -------------");
			
			System.out.println("�α������ּ���.");
			
			
			
			while(br.readLine() != null){
				System.out.print("id:");
				String userid = br.readLine();
			

				System.out.print("pass:");
				String userpw = br.readLine();
				
				Iterator<UserVO> it1 = dao.select(userid, userpw).iterator();
				if (it1.hasNext()){
					temp1 = it1.next();
					
					System.out.println("�α��� ����......"+temp1.getUsernm()+"�� �α��� �ϼ̽��ϴ�.");
					System.out.println("-------------ȸ�� ���� �ý��� -------------");
					System.out.println("1.�Է�\t2.��ȸ\t3.����\t4.����\t5.����");
					System.out.print("-->");

					while ((input = is.read()) != -1){
						switch((char)input){
							case '1': 
								result = dao.insert(vo);
								if(result < 0){
									System.out.println(done);
								}else{
									System.out.println(result+ "�� �Է� ����"); 
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
											dao.select().size()+"�� �˻� �Ϸ�-------------------");
								}else{
									System.out.println("�˻� ��� ����.");
								}						
								
								
								break;
							case '3': 
								result = dao.update(vo);
								if(result < 0){
									System.out.println(done);
								}else{
									System.out.println(result+ "�� ���� ����"); 
								}
								break; 
								
							case '4': 
								result = dao.delete(vo);
								if(result < 0){
									System.out.println(done);
								}else{
									System.out.println(result+ "�� ���� ����"); 
								}
								break;
								
							case '5':
								
								System.out.println("------------�ý��� ����-----------------");
								break;
							
							}//switch
						
						if (input == 13 || input == 10) continue;
						
						if (input == '5') break;
						
						System.out.println("1.�Է�\t2.��ȸ\t3.����\t4.����\t5.����");
						System.out.print("-->");	
						
					}//while
				}else{
					System.out.println("���̵�� ��й�ȣ ������ �����.");
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


 




