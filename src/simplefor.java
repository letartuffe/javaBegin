//for
public class SimpleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 5 ; i++){
			System.out.println(i+"번째 실행하였어요.");
		}
		
		for (int i = 0 ; i<10;i++){
			System.out.println(i+"*"+i+" = "+(i*i));
		}
		
		//구구단 
		System.out.println("----------------------------");

		for (int i = 1 ; i<10;i++){
			System.out.println(i+"*"+2+" = "+(i*2));
			System.out.println(i+"*"+3+" = "+(i*3));
			System.out.println(i+"*"+4+" = "+(i*4));
			System.out.println(i+"*"+5+" = "+(i*5));
			System.out.println(i+"*"+6+" = "+(i*6));
			System.out.println(i+"*"+7+" = "+(i*7));
			System.out.println(i+"*"+8+" = "+(i*8));
			System.out.println(i+"*"+9+" = "+(i*9));
		}

		System.out.println("----------------------------");
		
		for(int i =2; i<=9; i++){
			for (int j =1 ; j<=9 ;j++){
				System.out.println(i+"*"+j+" = "+(i*j));
			}
		}

		System.out.println("11----------------------------");
		
		for (int k = 2 ; k<10;k++){
			for (int l =1 ; l<=9 ;l++){
				System.out.print(k*l);
			}
		}
		System.out.println("11----------------------------");
		

	}

}
