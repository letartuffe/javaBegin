
public class Gugudan {
	public static void main(String[] args) {
		
		//������ 2�� ���
		for(int i=1 ; i<=9 ; i++){
			System.out.println("2 * " + i + " = " + 2*i);
		}
		
		System.out.println("-------------");
		
		//������ 2�ܺ��� 9�ܱ��� �ݺ��ϴ� for��
		for(int i=2 ; i<=9 ; i++){
			 
			//i���� ���� 1~9���� �������� ����ؼ� ����ϴ� for��
			for(int j=1 ; j<=9 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
