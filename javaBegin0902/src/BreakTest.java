
public class BreakTest {

	public static void main(String[] args) {
//		 1���� 100 ������ �ڿ��� �߿��� 
//		���� ū 7�� ����� ���� ǥ��
		
		for(int i=100 ; i>=1 ; i--){
			if( (i%7)==0 ) {
				System.out.println("1���� 100������ �ڿ��� �߿��� ���� ū 7�� ����� " + i);
				break;
			}
		}

	}

}
