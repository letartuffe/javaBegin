
public class SimpleWhille {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5 ; i++){
			System.out.println(i+"번째 실행하였어요.");
		}
		
		int i = 1;
		int j = 0 ;
		while(i<11){
			j = i + j;
			System.out.println(i+"까지의합 "+j);
			i++;
			
		}
		System.out.println("1부터 10까지의합 : "+j);
		int k =10;
		while(k >= 1){
			System.out.println(k);
			k--;
			if(k<1){
				System.out.println("\"fire!~~\"");
			}
		}
		
		System.out.println("=== count down!=====");
		i = 10;
		do {
			System.out.println(i--);
			if (i==0){
				System.out.println("Fire~!!");
			}
		}while (i<0);
	}

}
