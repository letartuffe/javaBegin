//점수가 90점 이상 A
//98 점 A+
//94 A0
//A-
//
//80점 이상 B
//88 B+
//84 B0
//B-
//
//나머지 C
//
//점수 score
//학점 grade
//
//결과출력 
//당신의 학점은 ~ 입니다.
public class GrdadeIF2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 89;
		String grade ;
		if (score >= 90){
			if (score >= 98){
				grade = "A+";
			}else if(score >= 94){
				grade = "A0";
			}else{
				grade = "A-";
			}
		}else if (score >= 80){

			if (score >= 84){
				grade = "B+";
			}else if(score >= 84){
				grade = "B0";
			}else{
				grade = "B-";
			}
		}else {
			grade = "C";
		}
		System.out.printf("당신의 학점은 %s입니다", grade);
	}

}
