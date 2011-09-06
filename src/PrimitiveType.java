
public class PrimitiveType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 논리형 데이터 선언
		boolean flag;
		flag = true;
		// flag = 100; 논리형 데이터에는 true / false만 저장가능
		
		System.out.println(flag);
		
		//--------------------------------------------------------
		
		int a =10; // int형 변수 a를 선언하면서 10으로 초기화
		int b =20; // int형 변수 b를 선언하면서 20으로 초기화
		
		flag = a > b;

		System.out.println(flag);
		
		System.out.println("-------char-----------------------------");
		
		char first = 'A';
		char second = '\u0041';
		char third = 65;

		System.out.println(first);
		System.out.println( second);
		System.out.println(third);
		
		System.out.println("-------escape sequence  ---------------");
		System.out.println("\"A\"");
		System.out.println("\"B\"\tC\nD");
		
		
		//변수j를 선언하여 java를 저장
		//char형으로는 여러문자 저장 못함. String 사용
		String j = "java";
		System.out.println(j);
		
		//변수h를 선언하여 hello를 저장
		String h = "hello";
		
		//변수 j,h를 이용하여 hello java를 출력
		System.out.println(j+" "+h);
		
		System.out.println("----정수형 데이터  ---------------");
		
		int c = 100;
		long d = 20000000000L;
		byte e = 127;

		System.out.println(d);

		System.out.println("----실수형 데이터  ---------------");
		float f = 3.14f;
		double g = 3.14;
		System.out.println();
		
		System.out.println("----실수형 상수  ---------------");
		final double PI = 3.14 ;
		
	}

}
