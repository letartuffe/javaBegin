package db;

import java.io.*;
import java.sql.*;



public class UserManagementSystem {

	
	private static String userid = null;
	private static String userpw = null;
	private static String usernm = null;
	private static String address= null;
	
	static String query =null;		
	static String querySelectAll = "select * from T_MEMBER";//select query
	
	static Connection con = null  ;
	static PreparedStatement pstmt = null ;
	static ResultSet rs = null ;
	
	static BufferedReader br = null;
	
	static //insert,update ���ϰ� ���� ����
	int ins = 0 ;

	public UserManagementSystem() {
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbID = "test";
			String dbPW = "1111";
			
			//����̹��ε�
			Class.forName(driver);

			//Ŀ�ؼ� ��ü�� ����
			con = DriverManager.getConnection(dbURL, dbID, dbPW);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) {
		new UserManagementSystem();
		
		InputStream is = System.in;
		int input = 0 ;
	
		System.out.println("-------------ȸ�� ���� �ý��� -------------");
		System.out.println("1.�Է�\t2.��ȸ\t3.����\t4.����\t5.����");
		System.out.print("-->");

		try {
			while ((input = is.read()) != -1){
				switch((char)input){
					case '1': input(); break;
					case '2': select(); break;
					case '3': modify(); break;
					case '4': delete(); break;
					case '5':
						System.out.println("------------�ý��� ����-----------------");
						break;
					
				}//switch
				
				if (input == 13 || input == 10) continue;
				if (input == '5') break;
				
				System.out.println("1.�Է�\t2.��ȸ\t3.����\t4.����\t5.����");
				System.out.print("-->");	
				
			}//while


	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		finally{
//			
//				try {
//					if (rs != null) rs.close();
//					if (pstmt != null) pstmt.close();
//					if (con != null) con.close();
//					
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			
//		}
		
	}

	private static void modify()  {
		
		String field = null ;
		String fieldValue = null ;
			
		
		//select();
		
		System.out.println("������ ȸ���� ���̵� �Է��ϼ���. ");
		
		System.out.print("id:");
		
		if ((userid = readlineM()) != null){
			
			
			rs = (ResultSet) selectRT(userid);
			//���� ���� ��� ���
			//���� ���� ��� ���

			try {
				
				if (rs.next() != false) {
					
					while(readlineM() != null ){
						System.out.println("�����Ͻ� �׸��� �����ϼ���.");
						System.out.println("1.���̵�\t2.���\t3.�̸�\t4.�ּ�");
						

						switch (Integer.parseInt(readlineM())){
							case 1:
								System.out.print("���̵�-->");	
								field = "userid";
								fieldValue = readlineM();
								break;
							case 2:
								System.out.print("��й�ȣ-->");	
								field = "userpw";
								fieldValue = readlineM();
								break;
							case 3:
									System.out.print("�̸�-->");	
									field = "usernm";			
									fieldValue = readlineM();				
									break;
							case 4:
								System.out.print("�ּ�-->");	
								field = "address";	
								fieldValue = readlineM();						
								break;
							default :
								break ;
						}//switch
						
						String sql = "update t_member set " + field + "=? where userid='"+userid+"'";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, fieldValue);
						
						ins = pstmt.executeUpdate();
						
						if (ins > 0){
							System.out.println(ins + "�� �� ���� ����");
						}else{
							System.out.println(ins + "�� �� ����. ....  update ����.");
						}
						break;
						
					}//while
				}else{
					System.out.println("");
					System.out.println("------------------------------------------------");
					System.out.println("�Է��Ͻ� ȸ�����̵� �����ϴ�.. ");
					modify();
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}//while
				
		
		
	}//modify

	private static void delete() {
		// TODO Auto-generated method stub
		
		System.out.println("������ ȸ���� ���̵� �Է��ϼ���. ");
		System.out.println("id:");
		
		userid = readlineM();
		
		if ((userid = readlineM()) != null){
			
			

			String queryDelete = "delete from t_member where userid=?";
			
			try {
				pstmt = con.prepareStatement(queryDelete);
				pstmt.setString(1, userid);
				ins = pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (ins > 0){
				System.out.println(ins + "�� ��  ����  ����");
			}else{
				System.out.println(ins + "�� �� ���� . ....  delete ����.");
			}
		}
		
	}

	private static void select() {					
		
		//query�� ����
		try {
			querySelectAll = "select * from T_MEMBER";//select query
			pstmt = con.prepareStatement(querySelectAll);
			rs = pstmt.executeQuery();
			
			//���� ���� ��� ���
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void selectid(String userid) {					

		
		//query�� ����
		try {
			
			querySelectAll = "select * from T_MEMBER where userid=?";
			pstmt = con.prepareStatement(querySelectAll);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			//���� ���� ��� ���
			while(rs.next() ){
				System.out.println(rs.getString("userid")+" "+rs.getString("userpw")+" "+rs.getString("usernm")+" "+rs.getDate("REG_DATE"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	private static Object selectRT(String userid) {					
		
		//query�� ����
		try {
			
			querySelectAll = "select * from T_MEMBER where userid=?";
			pstmt = con.prepareStatement(querySelectAll);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
			
	}

	private static void input() {
		//���ڿ� �Է¹ޱ�
		br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		try {
			while(br.readLine() != null){
				System.out.print("id:");
				userid = br.readLine();
	
				System.out.print("pass:");
				userpw = br.readLine();
				
	
				System.out.print("name:");
				usernm = br.readLine();
				
	
				System.out.print("address:");
				address = br.readLine();
				
				//������ ����
	
	
				String queryInsert = "insert into t_member values (?,?,?,?,t_member_seq.nextval,SYSDATE)";
				
				
				//������Ʈ��Ʈ ��ü ����
				pstmt = con.prepareStatement(queryInsert);
				pstmt.setString(1, userid);
				pstmt.setString(2, userpw);
				pstmt.setString(3, usernm);
				pstmt.setString(4, address);
				
				ins = pstmt.executeUpdate();
				
				if (ins > 0){
					System.out.println(ins + "�� �� ���� ����");
				}else{
					System.out.println(ins + "�� �� ����. ....  insert ����.");
				}
				break;
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (ins > 0){
			System.out.println(ins + "�� �� ���� ����");
		}else{
			System.out.println(ins + "�� �� ����. ....  insert ����.");
		}
		
	}

	private static String readlineM() {

		//���ڿ� �Է¹ޱ�
		br = new BufferedReader(new InputStreamReader(System.in)) ;
		String result = null ;
		try {
			if ((result=br.readLine()) != null){
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}

}
