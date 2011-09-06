public class Section02_1 {

	public static void main(String[] args) {
		// 중첩if문을 이용하여 학점 판단.
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
		System.out.println();
		
		// 영어 대소문자 구별
		char char1= 'A';
		if ((int)char1 >= 'A' && (int)char1 <= 'Z'){
			System.out.println("대문자");
		}else if((int)char1 >= 'a' && (int)char1 <= 'z'){
			System.out.println("소문자");
		}else{
			System.out.println("대소문자 이외의 문자");
		}
		
		//switchgift
		int score1 = (int)(Math.random()*4);
		String gift=""; 
		score1 = score1 * 100;
		System.out.println(score1);

		switch (score1) {
			case 100 : System.out.println("당신의 점수는 "+score1+"점이고, 선물은 자전거입니다.");break;
			case 200 : System.out.println("당신의 점수는 "+score1+"점이고, 선물은 TV입니다.");break;
			case 300 : System.out.println("당신의 점수는 "+score1+"점이고, 선물은 노트북입니다.");break;
			default : System.out.println("선물은 다음 기회에..");
		}
		
		//다중 for문
		int charA = (char)'A';
		for(int s = 1; s<6 ;s++){
			for (int i=0 ;i < 6;i++){
				System.out.print((char)charA++);
				if(charA > 'Z') break;
			}
			System.out.println();
		}
		
		//이중포문 구구단
		for (int i = 1;i<10;i++){
			for (int j =2;j<10;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		
	}

}
