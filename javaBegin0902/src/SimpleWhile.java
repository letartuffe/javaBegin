
public class SimpleWhile {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++){
			System.out.println(i + "��° ����");
		}
		
		System.out.println("== while�� �̿� ==");
		
		int i=1 ;
		while(i<=5){
			System.out.println(i + "��° ����");
			i++;
		}
		
		System.out.println("== 1���� 10���� ���� �հ� ���==");
		i=1 ;
		int sum = 0;
		
		while(i<=10){
			sum = sum + i;	//sum += i;
			
			System.out.println(i + "������ �� : " + sum);
			i++;
		}
		
		System.out.println("== Count down!~ ==");
		i = 10;
		do{
			System.out.println(i--);
			if(i==0){
				System.out.println("Fire!~");
			}
		}while(i<0);
	}

}









