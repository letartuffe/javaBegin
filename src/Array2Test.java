//2차원 배열 실습
public class Array2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1차원 배열과 2차원 배열 함께 연습하기.
		
		String title[] = {"java", "hteml", "C", "total"};
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
						
		System.out.println();
		System.out.println("----------------------------");
						
		for (i =0 ; i <3 ; i++){
			for (j = 0; j<4 ; j++){
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}

}
