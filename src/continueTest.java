//0~10 .... 3~6���� ���
//0~10 .... 3,6,9 ���� ���
//1~100 ... 7�� ��� ���
public class continueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<=10 ; i++ ){
			if ( i >=3 && i<=6){
				continue;
			}
			System.out.print(i+" ");
		}
			System.out.println();
			
		for(int i = 0; i<=10 ; i++ ){
			if ( i == 3 || i == 6 || i ==9){
				continue;
			}
			System.out.print(i+" ");
		}
			System.out.println();
			
		for(int i = 1; i<=100 ; i++ ){
			if ( i%7 != 0 ){
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
