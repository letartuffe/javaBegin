package str;

import java.util.StringTokenizer;

public class StringTokenizerTest {


	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java World");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}			
	
		
		
		//java#jsp#Sevelet#Struts 임의의 문자열에 저장
		//StringTokenizer 이용.
		//파싱할 문자열의 총개수.
		
		String jjsl = "java#jsp#Sevelet#Struts";
		
		StringTokenizer st2 = new StringTokenizer(jjsl, "#");
		
		System.out.println("파싱할 문자열의 총개수: "+ st2.countTokens());
		
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
	}
}


