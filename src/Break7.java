//1~100 의 자연수 중에서 가장 큰 7의 배수
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
