public class Homework1 {

	public static void main(String[] args) {
		//1번 -----------------
		int a1 = 10;
		int b1 = 7 ;
		
		System.out.println(a1^b1);
		
		//2번 ----------------------------------------
		System.out.println("======================");
		int a2 = 10;
		int b2 = 20;
		System.out.println(++a2);
			//1을 더하는 연산을 먼저하고 출력하므로 11을 출력
		System.out.println(++a2 + b2++);
			//앞에서 11이 된 a2에 1을 더하는 연산 수행 -- a2 + 1 = 12
			//둘을더하는 연산 수행                     -- a2 + b2 = 12 +20 =32 
			//b2에 1을 더하는 연산수행                 -- b2 = 21 
		System.out.println((++a2%3) + (a2*++b2) );
			//앞에서 12가된 a2에 1을 더하는 연산	-- a2 + 1 = 12 + 1 =13
			//3으로 나누고 몫을 구하는 연산     	-- 13%3 =1
			//a2와 21이 된 b2를 곱하는 연산       	-- 13*22 = 286
			//둘을 더함   							-- 286+1 = 287

		//3번----------------------------------------
		System.out.println("======================");
		int a3, b3;
		a3 = b3 = 10;
		
		boolean c3 = ++a3 > b3++ || a3++ >= ++b3 ;
			// a3+1 연산  	-- a3 = a3+1 = 10 + 1 = 11
			// > 연산  		-- 결과 true (11>10) 
			// b3+1 연산	-- b3 = b3+1 = 10 + 1 = 11
			// 참이었으므로 연산 종료
		
		System.out.println(a3+", "+b3);
		System.out.println("변수 c3의 값 : " +c3);
		System.out.println("======================");
		
		//ppt
		//OP_if.java
		//정수형 변수 mod 선언, 임의값 초기화
		// 조건삼항연산자 이용
		//홀수면 입력하신 숫자는 홀수 입니다.
		//짝수면 입력하신 숫자는 짝수 입니다. 
		//출력

		int mod = 235;
		String test;
		
		test = mod%2 == 0 ? "홀":"짝";
		System.out.printf("입력하신 숫자는 %s수입니다\n",test);
		
		System.out.println("======================");
		//10은 10.0f와 같다
		//'0'은 0과 같다
		//'A'는 65와 다르다
		
		boolean bool;
		
		int iten = 10;
		float itenf = 10f;
				
		bool = iten == itenf ? true : false ;
		System.out.println("10은 10.0f와 같다:"+bool);
		
		int szero = 0;
		char czero = '0';
		
		bool = szero == czero ? true : false ;
		System.out.println("\'0\'은 0과 같다:" + bool);
		
		int ia = 65;
		char a = 'A';
		
		bool =ia == a ? true : false ;
		System.out.println("\'A\'는 65와 같다:"+bool);
		

		System.out.println("======================");
		//OP_Logicical.java
		//문자형 변수 x 선언 임의의 영문자 저장
		// 조건삼항연산자 이용하여 x의 값이 대문자인지 소문자인지 비교하고 결과 출력
		
		
		char x = 'A';
		String bigorsmall;
		
		bigorsmall = (x >= 65 && x <= 90) ? "대":"소";
		System.out.printf("입력하신문자는 %s문자입니다.\n", bigorsmall);

		System.out.println("======================");
		
		//CharToCode.java
		//임의 문자의 아스키코드값을 10진수로 출력
		//묵시적형변환 문자형 -> 정수형
		char ascText = 'A';
		System.out.println("문자 \""+ascText+"\"의 아스키코드값 : "+(int)a);

		System.out.println("======================");
		//CodeToChar.java
		//임의의 10진수의 아스키코드값에 해당하는 문자를 출력
		//명시적 형변환  정수형 --> 문자형
		int asc = 65;
		System.out.println("아스키코드값 \""+asc+"\"의 문자 : "+(char)asc);
				
	}

}
