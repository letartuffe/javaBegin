package ios;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEX {

	public static void main(String[] args) 
			throws UnknownHostException {
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println("ȣ��Ʈ �̸� : " +
						   ia.getHostName());
		System.out.println("ȣ��Ʈ IP �ּ� : "+
						   ia.getHostAddress());
		
		System.out.println("== naver�� ȣ��Ʈ �̸��� IP �ּ�  ==");
		ia = InetAddress.getByName("www.naver.com");
		System.out.println("ȣ��Ʈ �̸� : " +
						   ia.getHostName());
		System.out.println("ȣ��Ʈ IP �ּ� : "+
						   ia.getHostAddress());
		
		System.out.println("== daum�� ȣ��Ʈ �̸��� IP �ּҵ� ==");
		InetAddress[] ias;
		ias= InetAddress.getAllByName("www.daum.net");
		for(InetAddress temp : ias){
			System.out.println("ȣ��Ʈ �̸� : " +
								temp.getHostName());
			System.out.println("ȣ��Ʈ IP �ּ� : "+
								temp.getHostAddress());
		}
		
	}

}

















