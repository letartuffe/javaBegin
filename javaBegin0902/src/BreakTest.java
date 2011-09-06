
public class BreakTest {

	public static void main(String[] args) {
//		 1부터 100 사이의 자연수 중에서 
//		가장 큰 7의 배수의 값을 표시
		
		for(int i=100 ; i>=1 ; i--){
			if( (i%7)==0 ) {
				System.out.println("1부터 100사이의 자연수 중에서 가장 큰 7의 배수는 " + i);
				break;
			}
		}

	}

}
