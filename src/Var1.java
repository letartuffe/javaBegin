/*
 * int 형 변수 n 선언
 * n을 4에 대입
 * 화면에 n에 두 배한 수에 3을 더한 결과를 표시
 * 
 * int 형 변수 a를 선언하면서 15로 초기화
 * int 형 변수 b를 선언하면서 32로 초기화
 * 더해서 2로 나눈 결과 출력 23.5가 되게.
 * 
 * 
 */
public class Var1 {

	public static void main(String[] args) {
		int n ;
		n = 4 ;
		System.out.println(n*2+3);
		
		int a = 15;
		int b = 32;
		System.out.println((double)(a+b)/2);
		
		
		int c = 3+2 ;
		int d = 5-8 ;
		int e = 3*4 ;
		double f = (double)7/3 ;
		System.out.println("3+2는 "+c+"입니다");
		System.out.println("5-8은 "+d+"입니다");
		System.out.println("3곱하기4는 "+e+"입니다");
		System.out.println("7나누기3은 "+f+"입니다");
		
		byte aa = 10;
		byte bb = 20;
		//byte cc = (aa+bb);      
		byte cc = (byte) (aa+bb);
		System.out.println(cc);

		int aaa = 1000000;
		int bbb = 2000000;
		long ccc = (long) aaa*bbb;
		System.out.println(ccc);
		
		System.out.println("--------println---------");
		System.out.println("0*0 = " + (0*0));
		System.out.println("1*1 = " + (1*1));
		System.out.println("2*2 = " + (2*2));
		System.out.println("3*3 = " + (3*3));

		System.out.printf("\n-------printf-----------");
		System.out.printf("5*5 = %d%n", 5*5);
		System.out.printf("6*6 = %d%n", 6*6);
		System.out.printf("7*7 = %d%n", 7*7);
		System.out.printf("8*8 = %d%n", 8*8);
		System.out.printf("9*9 = %d%n", 9*9);
		
		
		
		int kor = 90;
		int eng = 40;
		
		boolean result;
		result = kor == eng ;
		System.out.println(result);
		
		result = kor != eng;
		System.out.println(result);
		
		//국어가 90점 이상이고
		//영어ㅓ 점수가 90점 이상인지 비교한 결과를
		//result에 저장하고 출력

		result = (kor >= 90) && (eng>= 90);
		
		System.out.println(result);
		
		result = (kor >= 90) || (eng>= 90);
		
		System.out.println(result);
		
		
		
		
		
		System.out.println("--------비트 연산자-------------");
		//정수형 변수 a를 선언하고 10으로 초기화
		//정수형 변수 b를 선언하고 7으로 초기화
		//정수형 변수 c를 선언하고  a와 b를 & 연산한 결과를 저장
		
		int ia = 10;
		int ib = 7;
		int ic = ia & ib; // 1010 & 0111 --- 0010 
		System.out.println(ic);
		
		
		
	}
}