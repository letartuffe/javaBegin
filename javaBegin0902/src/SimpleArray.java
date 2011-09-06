
public class SimpleArray {

	public static void main(String[] args) {
		int[] no1 = new int[]{1,2,3,4};
		int[] no2 = {5,6,7,8};

		for(int temp : no2){
			System.out.println(temp);
		}
		
		System.out.println("-----------");
				
		//5명의 점수를 저장할 정수형 배열 변수 score 생성
		int[] score = new int[5];
		score[0] = 80;
		score[1] = 51;
		score[2] = 48;
		score[3] = 29;
		score[4] = 99;
	//	score[5] = 99;	이건 쓸 수 없음. 길이를 넘어감
		

		for(int i=0 ; i<score.length ; i++){
			System.out.println(score[i]); 
		}
		

		System.out.println("-----------");
		//문자형 배열 선언
		char[] ch;
		
		//배열 생성
		ch = new char[4];
		
		//배열의 초기화
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//배열 내용 출력
		for(int i=0 ; i<4 ; i++){
			System.out.println("ch[" + i + "] = " + ch[i]); 
		}
		
		System.out.println("-----------");

		for(int i=0 ; i<4 ; i++){
			System.out.print(ch[i]); 
		}
		

		System.out.println("-----------");
		
		//점수 4개를 저장할 변수  생성하고 초기화
		int[] jumsu = {100, 90, 80, 75};
		int total = 0;
		float avg = 0.0f;

		//총점 누적 계산
		for(int i=0 ; i<jumsu.length ; i++){
			total = total + jumsu[i];
			//또는 total += jumsu[i];
		}
		
		//평균 계산
		//이렇게 하면 소수점이하를 버림
		//avg = total/jumsu.length;
		
		//그래서 이렇게 캐스팅 해야됨.
		avg = (float)total/jumsu.length;
		
		//총점 및 평균 출력
		System.out.print("총점 :" + total);
		System.out.println(", 평균 : " + avg);
	}

}








