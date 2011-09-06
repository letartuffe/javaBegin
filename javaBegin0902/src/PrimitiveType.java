
public class PrimitiveType {

	public static void main(String[] args) {
		
		int i1 = 2147483647;
		int i2 = 1;
		long i3 = i1 + i2;
		System.out.println(i3);
		
		
		System.out.println("===== 정수형 =====");
		int c = 100;
		long d = 20000000000L;
		byte e = 127;
		

		System.out.println("===== 실수형 =====");
		float f = 3.14f;
		double g = 3.14;
		

		System.out.println("===== 실수형 상수 =====");
		final double PI = 3.14;
		// PI = 3.1429587308174780; 
		// 상수라서 값 변경 불가능
		
		System.out.println("===== char =====");
		char first = 'A';
		char second = '\u0041';
		char third = 65;
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

		System.out.println("- escape sequence -");
		System.out.println("\"A\"");
		System.out.println("B\tC\nD");
		
		
		//변수 j를 선언하여 java를 저장
		String j = "java";
		
		// char jj = 'java';  문자형에 문자열 저장 불가
		
		// 변수 h를 선언하여 hello를 저장
		String h = "hello";		
		
		// 변수 j와 h를 이용하여 화면에 hello java를 출력
		System.out.println(h + " " + j);
		
		
		System.out.println("===== boolean =====");
		//논리형 데이터 선언
		boolean flag;
		
		flag = true;
		//	flag = 100; 이렇게는 쓸 수 없음.
		// 	논리형 데이터에는 true / false 만 저장 가능
		
		System.out.println(flag);
		
		//int형 변수 a를 선언하면서 10으로 초기화
		int a = 10;
		
		//int형 변수 b를 선언하면서 20으로 초기화
		int b = 20;
		
		//a가 b보다 큰지 비교한 값을 flag에 저장
		flag  = a > b;

		System.out.println(flag);
		
	}

}
