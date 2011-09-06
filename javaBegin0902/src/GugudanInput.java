
public class GugudanInput {
	public static void main(String[] args) {
		
		//문자열을 숫자로 파싱
		int dan = Integer.parseInt(args[0]);
		
		//구구단 2단 출력
		for(int i=1 ; i<=9 ; i++){
//			System.out.println("2 * " + i + " = " + 2*i);
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		

	}

}
