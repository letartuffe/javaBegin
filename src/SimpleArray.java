//�迭 ����, ����, �ʱ�ȭ
public class SimpleArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ������ �迭 ����
		char[] ch;
		
		//�迭 ����
		ch = new char[4];
		
		//�迭 �ʱ�ȭ
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
			//�迭 ���
			for (int i =0; i <4 ;i++){
				System.out.println("ch["+i+"] = "+ch[i]);
			}
			for (int i =0; i <4 ;i++){
				System.out.print(ch[i]);
			}
			System.out.println();
		// ������ �迭 ���� 5��..���� �ʱ�ȭ
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
		
			//foreach...������ ����
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
			//ĳ���þ��� int������ ��� ����� double�� ���� ���
			//�Ҽ��� ���� ���� �ҽ�.. 
			//��� ���� �� ĳ������ ��...
			aveScore = (double)totalScore/arrayScore.length ;
			
			
			System.out.println("���� : " + totalScore + " , ��� : " + aveScore);
	}

}
