package str;

import java.util.StringTokenizer;


public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java World");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

		System.out.println("================");
		String data="Java#Jsp#Servlet#Struts";
		st = new StringTokenizer(data, "#");
		System.out.println("�Ľ��� ���ڿ��� �� ���� : " 
		                   + st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
