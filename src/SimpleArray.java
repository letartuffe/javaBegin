//배열 선언, 생성, 초기화
public class SimpleArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 문자형 배열 선언
		char[] ch;
		
		//배열 생성
		ch = new char[4];
		
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
			//배열 출력
			for (int i =0; i <4 ;i++){
				System.out.println("ch["+i+"] = "+ch[i]);
			}
			for (int i =0; i <4 ;i++){
				System.out.print(ch[i]);
			}
			System.out.println();
		// 정수형 배열 선언 5개..생성 초기화
		int[] score = new int[5];

		score[0] = 80;
		score[1] = 51;
		score[2] = 48;
		score[3] = 29;
		score[4] = 99;
			for (int i =0; i < score.length  ;i++){
				System.out.println(score[i]);
			}
			
		int[] no1 = new int[]{1,2,3,4};
		int[] no2 = {5,6,7,8};
		
			//foreach...개선된 루프
			for (int temp : no2){
				System.out.println(temp);
			}
		
		int[] arrayScore = {100, 90, 80, 75};
		int totalScore = 0;
		double aveScore = 0;
		
			for(int temp : arrayScore){
				//totalScore = totalScore + temp;
				totalScore += temp;
			}
			//캐스팅없이 int끼리의 계산 결과를 double에 담을 경우
			//소수점 이하 정보 소실.. 
			//계산 전에 꼭 캐스팅할 것...
			aveScore = (double)totalScore/arrayScore.length ;
			
			
			System.out.println("총점 : " + totalScore + " , 평균 : " + aveScore);
	}

}
