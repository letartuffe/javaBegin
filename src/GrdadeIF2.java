//������ 90�� �̻� A
//98 �� A+
//94 A0
//A-
//
//80�� �̻� B
//88 B+
//84 B0
//B-
//
//������ C
//
//���� score
//���� grade
//
//������ 
//����� ������ ~ �Դϴ�.
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
		System.out.printf("����� ������ %s�Դϴ�", grade);
	}

}
