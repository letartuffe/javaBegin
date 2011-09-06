package oop;

public class HomeWork819 {
  
	/**
	 * @param args
	 */  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 성적표
		// 1차배열, 2차 배열 함께 연습하기
		
		String title[] = {"java", "html", "C", "total"};
		int jumsu[][] = { 
				{77,66,88,231},
				{90,80,100,270},
				{65,75,85,225}
			};
		int i, j;
		
		System.out.println("----------성적표------------");
		
		for (i = 0; i < title.length ; i++){
			System.out.print(title[i]+"\t");
		}
		System.out.println("\n----------------------------");
						
		for (i =0 ; i <3 ; i++){
			//아무리 생각해도 이쪽에서 무엇을 해야할지 모르겠습니다.
			for (j = 0; j<3 ; j++){
				//요기는 한줄로 해야할거같은데요.
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//
		System.out.println("==================================");
		System.out.println();
		
		
		//이자 계산 메서드
		int won = 20000 ;
		char grade = 'a';
		
		MethodTest method1 = new MethodTest();
		
		System.out.println("원금 20000원에 대한 이자는 "+method1.interest(won, grade)+"입니다.");
		
		
		//연습문제
		int age = Integer.parseInt(args[0]);
		if(age < 20){
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 10대 이군요.");
		}else if (age < 30 ){
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 20대 이군요.");
		}else if (age < 40){
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 30대 이군요.");
		}else if (age < 50){
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 40대 이군요.");
		}else if (age < 60){
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 50대 이군요.");
		}else if (age < 70){
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 60대 이군요.");
		}else if (age < 80){
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 70대 이군요.");
		}else if (age < 90){
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 80대 이군요.");
		}else if (age < 100){
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 90대 이군요.");
		}else {
			System.out.println("당신의 나이는 "+age+"입니다. 당신은 100대 이군요.");			
		}
	}
}
