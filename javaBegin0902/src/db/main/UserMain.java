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
		String done = "�۾� ó�� ����";
		int result = 0;
		int input = 0;
		
		System.out.println("======= ����� ���� �ý��� =======");
		System.out.println("1.�Է�  2.��ȸ  3.����  4.����  5.����");
		System.out.print("=> ");
		
		try {
			while( (input=is.read()) != -1){
				switch( (char)input){
					case '1' : result = dao.insert(vo);	
							   if(result>0) 
								  done = "==> ����� �Է� ����";  break;
					case '2' : Vector<UserVO> vec = dao.select();	
							   //���͸� �޾Ƽ� ȭ�鿡 ���
							   System.out.println("No.\t ID\t ��й�ȣ\t �̸�\t �ּ�\t ��������");
							   for(int i=0 ; i<vec.size() ; i++){
								   vo = vec.get(i);
								   System.out.print(vo.getUserno() + "\t ");
								   System.out.print(vo.getUserid() + "\t ");
								   System.out.print(vo.getUserpw() + "\t ");
								   System.out.print(vo.getUsernm() + "\t ");
								   System.out.print(vo.getAddress() + "\t ");
								   System.out.println(vo.getRegDate());
							   }
					
							   done = "==> ��ȸ �Ϸ�";		  break;
					case '3' : result = dao.update(vo);		
							   if(result>0) 
								   done = "==> ������ ���� ����"; break;
					case '4' : result = dao.delete(vo);		
							   if(result>0) 
								   done = "==> ����� ���� ����"; break;
					case '5' : System.out.println(
							   "---- THE END --");			  break;
				}				
				if( input==13 || input==10) continue;
				if( input=='5') 			break;				
				
				System.out.println(done);	//���� ���� ��� �޽��� ���
				System.out.println("1.�Է�  2.��ȸ  3.����  4.����  5.����");
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








