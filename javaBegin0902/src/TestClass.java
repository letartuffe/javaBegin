/**
 * 
 * @author 김경희
 * 만든 날짜 : 2011. 8. 18. 목요일
 * 파일 내용 : 자바 기본 연습
 */

public class TestClass {
	
	static int total;
	
	public static void main(String[] args){
		int math;
		int eng;
		
		math = 90;
		eng = 100;
		
		int kor = 75;
		double avg;
		String gyulgwa;
		
		total = math + eng;
		
		total = total + kor;
		//total += kor;
		
		avg = total/3;
		
		//조건 연산자를 이용하여 결과 판정
		//조건 : 총점이 200점 이상이면 합격
		//      총점이 200점 미만이면 불합격
		gyulgwa = total>=200 ? "합격" : "불합격";
		
		
		System.out.print("math : ");
		System.out.println(math);
		System.out.println("영어 : " + eng);
		System.out.println("국어 : " + kor);
		System.out.println("===============");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("===============");
		System.out.println("결과 : " + gyulgwa); 
		
		
		

		System.out.println();
		System.out.println();
		
		
		
		
		
		
		System.out.println();
		boolean result;
		result = kor == eng;
		System.out.println(result);
		result = kor != eng;
		System.out.println(result);
		
		//국어 점수가 90점 이상이고
		//영어 점수도 90점 이상인지 비교한 결과를
		//result에 저장하고 결과 출력
		result = (kor>=90) && (eng>=90);
		System.out.println(result);

		result = (kor>=90) || (eng>=90);
		System.out.println(result);

		System.out.println("==문자열 비교 ==");
		//문자열 변수 id를 선언하여 admin을 저장
		String id = "admin";
		
		//문자열 변수 input을 선언하여 guest를 저장
		String input = "guest";
		
		//id와 input가 같은지 비교한 결과를 
		result = id.equals(input);
				
		//result에 저장하고 출력
		System.out.println(result);
		System.out.println(!result);

		System.out.println("==비트 연산자 ==");
//		정수형 변수 a를 선언하면서 10으로 초기화
		int a = 10;
		
//		정수형 변수 b를 선언하면서 7로 초기화
		int b = 7;
		
//		정수형 변수 c를 선언하면서
//		a와 b를 & 연산한 결과를 저장
		int c = a & b;
		
//		c의 값을 출력
		System.out.println(c);
		

		System.out.println("==조건 연산자 ==");
		// String id = "admin";
		//id가 "admin"이면 결과에 "관리자" 저장
		//    그렇지 않으면 "일반 사용자" 저장
		
		gyulgwa = id.equals("admin") 
				  ? "관리자" : "일반 사용자";
		
		//결과 값 출력
	}
	

	
}














class TestA{}
class TestB{}
