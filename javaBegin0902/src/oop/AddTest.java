package oop;

public class AddTest {

	public static void main(String[] args) {
		add(100, 200);
		int eeja = interest(10000);
		System.out.println("이자는 " + eeja);
	}
	
	private static void add(int i, int j) {
		System.out.println("덧셈결과는 " + (i+j) + "입니다.");
		
	}

	public static int interest(int wongum){
		//원금의 15% 이자 계산
		int eeja = (int)(wongum * 0.15);
		return eeja;
	}
}
