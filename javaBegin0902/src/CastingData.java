
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
//		int �� ���� score ���� �� 85.4�� �ʱ�ȭ
		int score = (int)85.6;
		
//		double�� ���� newScore ���� �� score �� ����
		double newScore = score;
		
//		score�� newScore�� ���� ���� ȭ�鿡 ���
		System.out.println("score : " + score);
		System.out.println("newScore�� : " + newScore);
		
//		���� ����

	}

}
