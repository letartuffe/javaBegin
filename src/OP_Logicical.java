//
public class OP_Logicical {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자형 변수 x 선언 임의의 영문자 저장
		// 조건삼항연산자 이용하여 x의 값이 대문자인지 소문자인지 비교하고 결과 출력
		
		
		char x = 'A';
		String test;
		
		test = (x >= 65 && x <= 90) ? "대":"소";
		System.out.printf("입력하신문자는 %s문자입니다.\n", test);
	}

}
