
public class SimpleArray {

	public static void main(String[] args) {
		int[] no1 = new int[]{1,2,3,4};
		int[] no2 = {5,6,7,8};

		for(int temp : no2){
			System.out.println(temp);
		}
		
		System.out.println("-----------");
				
		//5���� ������ ������ ������ �迭 ���� score ����
		int[] score = new int[5];
		score[0] = 80;
		score[1] = 51;
		score[2] = 48;
		score[3] = 29;
		score[4] = 99;
	//	score[5] = 99;	�̰� �� �� ����. ���̸� �Ѿ
		

		for(int i=0 ; i<score.length ; i++){
			System.out.println(score[i]); 
		}
		

		System.out.println("-----------");
		//������ �迭 ����
		char[] ch;
		
		//�迭 ����
		ch = new char[4];
		
		//�迭�� �ʱ�ȭ
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//�迭 ���� ���
		for(int i=0 ; i<4 ; i++){
			System.out.println("ch[" + i + "] = " + ch[i]); 
		}
		
		System.out.println("-----------");

		for(int i=0 ; i<4 ; i++){
			System.out.print(ch[i]); 
		}
		

		System.out.println("-----------");
		
		//���� 4���� ������ ����  �����ϰ� �ʱ�ȭ
		int[] jumsu = {100, 90, 80, 75};
		int total = 0;
		float avg = 0.0f;

		//���� ���� ���
		for(int i=0 ; i<jumsu.length ; i++){
			total = total + jumsu[i];
			//�Ǵ� total += jumsu[i];
		}
		
		//��� ���
		//�̷��� �ϸ� �Ҽ������ϸ� ����
		//avg = total/jumsu.length;
		
		//�׷��� �̷��� ĳ���� �ؾߵ�.
		avg = (float)total/jumsu.length;
		
		//���� �� ��� ���
		System.out.print("���� :" + total);
		System.out.println(", ��� : " + avg);
	}

}








