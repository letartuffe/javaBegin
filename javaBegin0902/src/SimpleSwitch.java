
public class SimpleSwitch {

	public static void main(String[] args) {
		// ������ 90�̸� A
		//		80�̸� B
		//      70�̸� C
		// �׷��� ������ F
		
		int score = 80;
		char grade = ' ';
		String message = "";
		
		switch(score){
			case 90 : grade = 'A'; break;	// Excellent
			case 80 : grade = 'B'; break;	// Good
			case 70 : grade = 'C'; break;	// Nomal
			default : grade = 'F';			// Cheer UP!
		}
		System.out.println("���� : " + grade);
		
		//switch / case���� �̿��Ͽ�
		//grade�� ���� �޽��� ���
		switch(grade){
			case 'A' : message = "Excellent"; break;
			case 'B' : message = "Good"; 	  break;
			case 'C' : message = "Nomal"; 	  break;
			default  : message = "Cheer UP!";
		}
		
	}

}
