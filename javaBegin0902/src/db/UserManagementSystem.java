package db;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class UserManagementSystem {
	private static String userid;
	private static String userpw;
	private static String usernm;
	private static String address;
	
	static Connection con;
	static PreparedStatement pstmt;
	static ResultSet rs;
	static BufferedReader br;
	
	static String query;
	static int result;
	static String done;
	
	//DB������ �����ڿ��� ó��
	public UserManagementSystem(){
		FileInputStream fis;
		Properties pro;
		String file = "src\\db\\jdbc.properties";
		
		try {
			fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
			
			String driver = pro.getProperty("driver");
			String url =  pro.getProperty("dbURL");
			String id  =  pro.getProperty("dbID");
			String pw  =  pro.getProperty("dbPW");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UserManagementSystem();
		
		InputStream is = System.in;
		int input = 0;
		System.out.println("======= ����� ���� �ý��� =======");
		System.out.println("1.�Է�  2.��ȸ  3.����  4.����  5.����");
		System.out.print("=> ");
		
		try {
			while( (input=is.read()) != -1){
				switch( (char)input){
					case '1' : insert();	break;
					case '2' : select();	break;
					case '3' : modify();	break;
					case '4' : delete();	break;
					case '5' : System.out.println(
							   "---- THE END --");		
							   break;
				}				
				if( input==13 || input==10) continue;
				if( input=='5') 			break;
				
				System.out.println("1.�Է�  2.��ȸ  3.����  4.����  5.����");
				System.out.print("=> ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(br!=null) 	br.close();
				if(rs!=null) 	rs.close();
				if(pstmt!=null)	pstmt.close();
				if(con!=null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//����� ���� ó�� �޼���
	private static void delete() {
		System.out.println("=> �����Ͻ� ID�� �Է��ϼ���.");
	}

	//����� ���� ���� ó�� �޼���
	private static void modify() {
		br = new BufferedReader(
				new InputStreamReader(
						System.in));
		System.out.println("=> �����Ͻ� ID�� �Է��ϼ���.");
		try {
			if( br.readLine() != null ){
				System.out.print(":: ���̵� : ");
				userid = br.readLine();
				
				System.out.println(":: ���� �׸� ����");
				System.out.println("::1.��й�ȣ"+
								   "  2.�̸�"+
								   "  3.�ּ�");
				String no = br.readLine();				
				StringBuffer sb;
				sb = new StringBuffer("UPDATE t_member SET ");
				
				if(no.equals("1")){
					System.out.print("::������ ��й�ȣ :");
					sb.append("userpw = '" + br.readLine() + "'" );
				}else if(no.equals("2")){
					System.out.print("::������ �̸� :");
					sb.append("usernm = '" + br.readLine() + "'" );
				}else if(no.equals("3")){
					System.out.print("::������ �ּ� :");
					sb.append("address = '" + br.readLine() + "'" );
				}else{
					System.out.println("1~3 �߿��Է�!!");
				}
				sb.append(" WHERE userid='");
				sb.append(userid);
				sb.append("'");
				
				query = sb.toString();
				//update ���� ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//����� ���� ��ȸ ó�� �޼���
	private static void select() {
		System.out.println("=> ����� ��ȸ�� �����մϴ�.");
		
	}

	//����� �Է� ���� ���� �޼���
	private static void insert() {
		br = new BufferedReader(
				new InputStreamReader(
						System.in));
		System.out.println("=> ����� �Է��� �����մϴ�.");
		
		try {
			if( br.readLine() != null ){
				System.out.print(":: ���̵� : ");
				userid = br.readLine();
				
				System.out.print(":: ��й�ȣ : ");
				userpw = br.readLine();

				System.out.print(":: �̸� : ");
				usernm = br.readLine();

				System.out.print(":: �ּ� : ");
				address = br.readLine();
				
			}
			
			//�Է¹��� ������ DB�� �Է� ó��

			System.out.println("=> ����� �Է� �Ϸ�!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}











