package str;

import java.util.StringTokenizer;

public class StringTokenizerTest {


	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java World");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}			
	
		
		
		//java#jsp#Sevelet#Struts ������ ���ڿ��� ����
		//StringTokenizer �̿�.
		//�Ľ��� ���ڿ��� �Ѱ���.
		
		String jjsl = "java#jsp#Sevelet#Struts";
		
		StringTokenizer st2 = new StringTokenizer(jjsl, "#");
		
		System.out.println("�Ľ��� ���ڿ��� �Ѱ���: "+ st2.countTokens());
		
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
	}
}


