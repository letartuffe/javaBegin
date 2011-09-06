//다차원 배열
public class MultiArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 선언
		int[][] test;
		
		//2차원 배열 생성
		test = new int[2][3];

		test[0][0] = 100;
		test[0][1] = 200;

		test[1][0] = 30;
		test[1][1] = 40;
		test[1][2] = 50;

		System.out.println(test.length);
		System.out.println(test[0].length);
		System.out.println(test[1].length);
		
		for (int i = 0 ; i < test.length ; i++){
			for (int j = 0; j <test[i].length ; j++){
				
				System.out.print(test[i][j] +" "+ i +" "+ j + " \n");
				
			}
			
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		int[][] test2 = { 	{1000,2000},
							{300, 400, 500},
		};
		
		System.out.println(test2.length);
		System.out.println(test2[0].length);
		System.out.println(test2[1].length);
		
		for (int i = 0 ; i < test2.length ; i++){
			for (int j = 0; j <test2[i].length ; j++){
				
				System.out.print(test2[i][j] +" "+ i +" "+ j + " \n");
				
			}
			
		}		
		
	}

}
