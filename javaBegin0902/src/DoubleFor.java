
public class DoubleFor {

	public static void main(String[] args) {
		//0부터 9까지 반복하는 for문
		for(int i=0 ; i<=9 ; i++){
			System.out.print(i + " : ");
			//i의 값만큼 *를 반복 출력하는 for문
			for(int j=0 ; j<i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
