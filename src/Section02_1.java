public class Section02_1 {

	public static void main(String[] args) {
		// ��øif���� �̿��Ͽ� ���� �Ǵ�.
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
		System.out.println();
		
		// ���� ��ҹ��� ����
		char char1= 'A';
		if ((int)char1 >= 'A' && (int)char1 <= 'Z'){
			System.out.println("�빮��");
		}else if((int)char1 >= 'a' && (int)char1 <= 'z'){
			System.out.println("�ҹ���");
		}else{
			System.out.println("��ҹ��� �̿��� ����");
		}
		
		//switchgift
		int score1 = (int)(Math.random()*4);
		String gift=""; 
		score1 = score1 * 100;
		System.out.println(score1);

		switch (score1) {
			case 100 : System.out.println("����� ������ "+score1+"���̰�, ������ �������Դϴ�.");break;
			case 200 : System.out.println("����� ������ "+score1+"���̰�, ������ TV�Դϴ�.");break;
			case 300 : System.out.println("����� ������ "+score1+"���̰�, ������ ��Ʈ���Դϴ�.");break;
			default : System.out.println("������ ���� ��ȸ��..");
		}
		
		//���� for��
		int charA = (char)'A';
		for(int s = 1; s<6 ;s++){
			for (int i=0 ;i < 6;i++){
				System.out.print((char)charA++);
				if(charA > 'Z') break;
			}
			System.out.println();
		}
		
		//�������� ������
		for (int i = 1;i<10;i++){
			for (int j =2;j<10;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		
	}

}
