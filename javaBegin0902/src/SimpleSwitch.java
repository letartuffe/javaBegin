
public class SimpleSwitch {

	public static void main(String[] args) {
		// 성적이 90이면 A
		//		80이면 B
		//      70이면 C
		// 그렇지 않으면 F
		
		int score = 80;
		char grade = ' ';
		String message = "";
		
		switch(score){
			case 90 : grade = 'A'; break;	// Excellent
			case 80 : grade = 'B'; break;	// Good
			case 70 : grade = 'C'; break;	// Nomal
			default : grade = 'F';			// Cheer UP!
		}
		System.out.println("학점 : " + grade);
		
		//switch / case문을 이용하여
		//grade에 따른 메시지 출력
		switch(grade){
			case 'A' : message = "Excellent"; break;
			case 'B' : message = "Good"; 	  break;
			case 'C' : message = "Nomal"; 	  break;
			default  : message = "Cheer UP!";
		}
		
	}

}
