package db;

import java.io.*;
import java.sql.*;


public class CopyOfCRUDexamStringInputVer2 {
	
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbID = "test";
	static String dbPW = "1111";  
	
	static Connection con = null ;
	
	public static void main(String[] args) {
		String id ="";
		String pass = "";
		String name = "";
		String address ="";
		
		
		String querySelectAll = "select * from T_MEMBER";//select query
		ResultSet rs ;
		int checkNum ;
				
		try {
			//����̹��ε�
			Class.forName(driver);
			
			//Ŀ�ؼ� ��ü�� ����
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			System.out.println("JDBC ����̹� �ε� ����! \n Ŀ���� ��ü ���� ����");
			
			
			//������Ʈ��Ʈ ��ü ����
			Statement stmt = con.createStatement();
			System.out.println("������Ʈ��Ʈ ��ü ���� ����");
			
			
			//���ڿ� �Է¹ޱ�
			Reader r = new InputStreamReader(System.in); ;
			BufferedReader br = new BufferedReader(r) ;
			
			System.out.println("-------------ȸ�� ���� �ý��� -------------");
			System.out.println("1.�Է�\t2.��ȸ\t3.����\t4.����\t5.����");
			System.out.print("-->");
			
			//insert,update ���ϰ� ���� ����
			int ins = 0 ;
			
			
			switch(Integer.parseInt(br.readLine())){
				case 1:

					System.out.println("id:");
					id = br.readLine();
					

					System.out.println("pass:");
					pass = br.readLine();
					

					System.out.println("name:");
					name = br.readLine();
					

					System.out.println("address:");
					address = br.readLine();
					
					//������ ����


					String queryInsert = "insert into t_member values ('" + id
							+ "','" + pass + "','" + name + "','" + address + "',t_member_seq.nextval,SYSDATE)";
					
					ins = stmt.executeUpdate(queryInsert);
					
					if (ins > 0){
						System.out.println(ins + "�� �� ���� ����");
					}else{
						System.out.println(ins + "�� �� ����. ....  insert ����.");
					}
					
					
					break;
				case 2:
					//query�� ����
					rs = stmt.executeQuery(querySelectAll);
					
					//���� ���� ��� ���
					while(rs.next() ){
						System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
					}
					
					break;
				case 3:  
					//
					
					//query�� ����
					rs = stmt.executeQuery(querySelectAll);
					//���� ���� ��� ���
					while(rs.next() ){
						System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
					}
					
					System.out.println("������ ȸ���� ���̵� �Է��ϼ���. ");
					
					System.out.println("id:");
					id = br.readLine();
						
					
					//query�� ����
					rs = stmt.executeQuery(querySelectAll);
					if (rs.next() != false){
						System.out.println("�����Ͻ�  �׸��� �������ּ���.");
						System.out.println("1. ��й�ȣ\t2.�̸�\t3.�ּ�");
						System.out.println("-->");
						
						String field = null ;
						String fieldValue = null ;
						
						while ((checkNum = Integer.parseInt(br.readLine())) != -1){
							switch(checkNum){
								case 1:
									System.out.println("��й�ȣ-->");	
									field = "userpw";
									fieldValue = br.readLine();
									break;
								case 2:
									System.out.println("�̸�-->");	
									field = "usernm";			
									fieldValue = br.readLine();				
									break;
								case 3:
									System.out.println("�ּ�-->");	
									field = "address";	
									fieldValue = br.readLine();						
									break;
							}//switch

							if (checkNum != 1 ||checkNum != 2 ||checkNum != 3) break;
							
							System.out.println("1. ��й�ȣ\t2.�̸�\t3.�ּ�");
							System.out.print("-->");	
							
						}//while
						
						String queryUpdate = "update t_member set "+ field +"='"+fieldValue+"' where userid='"+id+"'";
						
						ins = stmt.executeUpdate(queryUpdate);
						
						if (ins > 0){
							System.out.println(ins + "�� �� ���� ����");
						}else{
							System.out.println(ins + "�� �� ����. ....  update ����.");
						}
						
						querySelectAll = querySelectAll + " where userid='"+id+"'";		
						
						//query�� ����
						rs = stmt.executeQuery(querySelectAll);
						//���� ���� ��� ���
						while(rs.next() ){
							System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
						}
						
					}else {
						System.out.println("��ġ�ϴ� ���̵� �����.");
						break;
					}
					
					
					
//					
//
//					System.out.println("pass:");
//					pass = br.readLine();
//					
//
//					System.out.println("name:");
//					name = br.readLine();
//					
//
//					System.out.println("address:");
//					address = br.readLine();
					
					
					
					break;
				case 4:

					System.out.println("������ ȸ���� ���̵� �Է��ϼ���. ");
					System.out.println("id:");
					id = br.readLine();
					String queryDelete = "delete from t_member where userid='" + id + "'";
					
					
					ins = stmt.executeUpdate(queryDelete);
					
					if (ins > 0){
						System.out.println(ins + "�� ��  ����  ����");
					}else{
						System.out.println(ins + "�� �� ���� . ....  delete ����.");
					}
					break;
				case 5:
					System.out.println("���� �մϴ�.");
					System.exit(0);
					break;
				default :
					System.out.println("1~5������.....");					
			}
			
			
			
			
			
				
	
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		
	}

}
