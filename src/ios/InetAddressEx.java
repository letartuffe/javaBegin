package ios;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	
	public static void main(String[] args) throws UnknownHostException  {
		// TODO Auto-generated method stub
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println("ȣ��Ʈ �̸� : "+ia.getHostName());
		System.out.println("ȣ��Ʈ �̸� : "+ia.getHostAddress());
		
		ia = InetAddress.getByName("www.naver.com");
		System.out.println("���̹�: \t"+ia.getHostName());
		System.out.println("���̹�: \t"+ia.getHostAddress());

		System.out.println("����: \t"+ia.getByName("www.daum.net"));
		System.out.println("����: \t"+ia.getByName("daum.net"));
		
		
		InetAddress[] ias;
		ias = InetAddress.getAllByName("www.daum.net");
		
		for (InetAddress temp : ias){

			System.out.println("���� - : \t"+temp.getHostName());
			System.out.println("���� - : \t"+temp.getHostAddress());
		}

			
	}

}
