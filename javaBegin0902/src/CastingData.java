
public class CastingData {

	public static void main(String[] args) {
		System.out.println(3+2);
		System.out.println(5-8);
		System.out.println(3*4);
		System.out.println(7/3);
		System.out.println((double)7/3);
		System.out.println(7/3.0);
		System.out.println(7/3f);
		
		System.out.println("----------------");
//		int 형 변수 score 선언 및 85.4로 초기화
		int score = (int)85.6;
		
//		double형 변수 newScore 선언 및 score 값 대입
		double newScore = score;
		
//		score와 newScore의 값을 각각 화면에 출력
		System.out.println("score : " + score);
		System.out.println("newScore의 : " + newScore);
		
//		에러 대응

	}

}
