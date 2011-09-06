package str;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Java World";
		
		int index = s1.indexOf("a");
		System.out.println("맨 처음 a의 위치 : " + index);
		
		index = s1.lastIndexOf("a");
		System.out.println("마지막 a의 위치 : " + index);
		
		char c = s1.charAt(3);
		System.out.println("3번째 위치의 문자 : " + c);
		
		index = s1.indexOf("W");//W의 위치값을 index에 저장
		String str = s1.substring(index);
		System.out.println(str);
		
		//Wor만 출력
		str = s1.substring(index, index+3);
		System.out.println(str);
		
		System.out.println(s1.length());
		
		//문자열을 공백으로 구분하여 잘라서 배열에 저장
		String[] arr = s1.split(" ");
		for(int i=0 ; i<arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("==============");
		//20110821을 substring을 이용하여 
		//다음과 같이 분리하여 출력
		//2011년 08월 21일

		System.out.println("==============");
		//주민등록번호(991122-1234567)를 
		//임의의 변수에 저장한 후, 
		//성별을 판단하여 다음과 같이 결과 출력
		//"당신은 남자"

		System.out.println("==============");
		//my.image.picture.txt의 확장자를 추출하여
		//화면에 출력
		//"입력 파일의 확장자 : txt" 
	}

}
