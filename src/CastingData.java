//형변환  
public class CastingData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int 형 변수 score 선언 및 85.4 로 초기화
		//int score = 85.4;  //<< 에러
		
		int score = (int)85.4;   //디모션
		
		//double 형 변수  newScore 선언 및 score 대입
		double newScore = score;  //프로모션
		
		//출력
		System.out.println(score);
		System.out.println(newScore);
		

	}

}
