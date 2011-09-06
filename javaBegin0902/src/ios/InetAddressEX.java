package ios;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEX {

	public static void main(String[] args) 
			throws UnknownHostException {
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println("호스트 이름 : " +
						   ia.getHostName());
		System.out.println("호스트 IP 주소 : "+
						   ia.getHostAddress());
		
		System.out.println("== naver의 호스트 이름과 IP 주소  ==");
		ia = InetAddress.getByName("www.naver.com");
		System.out.println("호스트 이름 : " +
						   ia.getHostName());
		System.out.println("호스트 IP 주소 : "+
						   ia.getHostAddress());
		
		System.out.println("== daum의 호스트 이름과 IP 주소들 ==");
		InetAddress[] ias;
		ias= InetAddress.getAllByName("www.daum.net");
		for(InetAddress temp : ias){
			System.out.println("호스트 이름 : " +
								temp.getHostName());
			System.out.println("호스트 IP 주소 : "+
								temp.getHostAddress());
		}
		
	}

}

















