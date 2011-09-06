package str;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "Java World";
		
		int index = s1.indexOf("a");
		System.out.println("맨처음 a의 위치: "+index);
		
		index = s1.lastIndexOf("a");
		System.out.println("맨처음 a의 위치: "+index);
		
		char c = s1.charAt(3);
		System.out.println("3번째 위치의 문자: "+c);
		
		//W의 위치값을 index에 저장
		index = s1.lastIndexOf("W");
		
		
		String str = s1.substring(index);
		System.out.println(str);
		
		//Wor만 출력하기.
		str = s1.substring(5,8);
		System.out.println(str);
		

		str = s1.substring(index,index+3);
		System.out.println(str);
		
		System.out.println(s1.length());
		
		//문자열 잘라서 배열에 저장.
		String[] arr = s1.split(" ");
		
		for (int i =0;i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		//20110821을 입력해서 년월일로 구분.
		//2011년 08월 21일 로 출력
		
		String today = "20110821";
		System.out.println(today.subSequence(0, 4)+"년 "+today.subSequence(4, 6)+"월 "+today.substring(6)+"일");
		
		System.out.println("========================");
		
		
		
		
	}
}
