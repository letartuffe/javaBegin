
public class SimpleWhile {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++){
			System.out.println(i + "번째 수행");
		}
		
		System.out.println("== while을 이용 ==");
		
		int i=1 ;
		while(i<=5){
			System.out.println(i + "번째 수행");
			i++;
		}
		
		System.out.println("== 1부터 10까지 누적 합계 계산==");
		i=1 ;
		int sum = 0;
		
		while(i<=10){
			sum = sum + i;	//sum += i;
			
			System.out.println(i + "까지의 합 : " + sum);
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









