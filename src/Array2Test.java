//2���� �迭 �ǽ�
public class Array2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1���� �迭�� 2���� �迭 �Բ� �����ϱ�.
		
		String title[] = {"java", "hteml", "C", "total"};
		int jumsu[][] = { 
				{77,66,88,231},
				{90,80,100,270},
				{65,75,85,225}
			};
		int i, j;
		
		System.out.println("----------����ǥ------------");
		
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
