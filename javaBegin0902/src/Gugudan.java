
public class Gugudan {
	public static void main(String[] args) {
		
		//구구단 2단 출력
		for(int i=1 ; i<=9 ; i++){
			System.out.println("2 * " + i + " = " + 2*i);
		}
		
		System.out.println("-------------");
		
		//구구단 2단부터 9단까지 반복하는 for문
		for(int i=2 ; i<=9 ; i++){
			 
			//i단인 동안 1~9까지 구구단을 계산해서 출력하는 for문
			for(int j=1 ; j<=9 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
