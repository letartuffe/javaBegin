package ios;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	
	public static void main(String[] args) throws UnknownHostException  {
		// TODO Auto-generated method stub
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println("호스트 이름 : "+ia.getHostName());
		System.out.println("호스트 이름 : "+ia.getHostAddress());
		
		ia = InetAddress.getByName("www.naver.com");
		System.out.println("네이버: \t"+ia.getHostName());
		System.out.println("네이버: \t"+ia.getHostAddress());

		System.out.println("다음: \t"+ia.getByName("www.daum.net"));
		System.out.println("다음: \t"+ia.getByName("daum.net"));
		
		
		InetAddress[] ias;
		ias = InetAddress.getAllByName("www.daum.net");
		
		for (InetAddress temp : ias){

			System.out.println("다음 - : \t"+temp.getHostName());
			System.out.println("다음 - : \t"+temp.getHostAddress());
		}

			
	}

}
