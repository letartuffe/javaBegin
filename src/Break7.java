//1~100 �� �ڿ��� �߿��� ���� ū 7�� ���
public class Break7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 100 ; i > 1 ; i--){
			if (i%7 == 0){
				System.out.println(i);
				break;
			}
		}
	}
}
