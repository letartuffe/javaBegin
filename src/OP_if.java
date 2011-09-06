//조건 삼항 연산자
public class OP_if {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 변수 mod 선언, 임의값 초기화
		// 조건삼항연산자 이용
		//홀수면 입력하신 숫자는 홀수 입니다.
		//짝수면 입력하신 숫자는 짝수 입니다. 
		//출력

		int mod = 235;
		String test;
		
		test = mod%2 == 0 ? "홀":"짝";
		System.out.printf("입력하신 숫자는 %s수입니다\n",test);
		
		//10은 10.0f와 같다
		//'0'은 0과 같다
		//'A'는 65와 다르다
		
		int iten = 10;
		float itenf = 10f;
		boolean bool;
		
		bool = iten == itenf ? true : false ;
		System.out.println(bool);
		
		int szero = 0;
		char czero = '0';
		
		bool = szero == czero ? true : false ;
		System.out.println(bool);
		
		int ia = 65;
		char a = 'A';
		
		bool =ia == a ? true : false ;
		System.out.println(bool);
		
		
		
		
	}

}
