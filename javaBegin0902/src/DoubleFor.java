
public class DoubleFor {

	public static void main(String[] args) {
		//0���� 9���� �ݺ��ϴ� for��
		for(int i=0 ; i<=9 ; i++){
			System.out.print(i + " : ");
			//i�� ����ŭ *�� �ݺ� ����ϴ� for��
			for(int j=0 ; j<i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
