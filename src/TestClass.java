/* 클래스 3개 만들기 연습
 *	TestClass.java
 *	2011.8.17
 *	정성태
 */

public class TestClass {
	
	static int total; //맴버변수 전역변수.
	static double avg;
	
	public static void main(String[] args){
		
		int math;
		int eng;
		int kor;
		String rufrhk ;
		
		math = 90;
		eng = 20;
		kor = 75;
		
		total = math+eng+kor;
		avg =  total / 3;
		System.out.print("수학 : ");
		System.out.println(math);
		System.out.println("영어 : " + eng);
		System.out.println("국어 : " + kor);		
		System.out.println("==============================");
		System.out.println("총점 : " + total);		
		System.out.println("==============================");
		System.out.println("평균 : " + avg);		
		
		
		System.out.println("-------------------------");
		
		
		//문자열 변수 id를 선언하여 admin을 지정
		//문자열 변수 input을 선언하여 guest를 저장
		//id와 input가 같은지 비교한 결과를 result에 저장하고 출력.		
		
		String id = "admin";
		String input = "guest";
		boolean result;
		
		result = id == input;
		System.out.println(result);
		result = id.equals(input);  
		System.out.println(result);
		
		
		//id가 admin이면 결과에 관리자 그렇지 않으면 일반사용자 저장
		System.out.println("======조건 연산자==================");
		rufrhk = id.equals("admin") ? "관리자" : "일반사용자" ;
		System.out.println(rufrhk);
		
		
		
		
		//! 
		System.out.println("==   !    ====================");
		System.out.println(!result);
		System.out.println("==============================");
		//조건연산자를 이용하여 결과 판정
		//조건 : 총점이 200점 이상이면 합격
		//						미만이면 불합격
		
		//total >= 200 ? "합격" : "불합격";  
		//가독성이 떨어지니까 복잡하면 사용자제.
		
		rufrhk = total >= 200 ? "합격" : "불합격";
		System.out.println(rufrhk);
		
		
	}
	
	class TestA{}
}



class TestB{}