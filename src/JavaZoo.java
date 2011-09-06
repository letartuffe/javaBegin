public class JavaZoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//arguements 를 받으면 string으로 args에 저장
		
		
		System.out.println("==========Java Zoo=========");
		System.out.println(args.length+"마리 동물들로 동물원만들기");
		
		//.length 이용시 주의사항. -- 1부터 시작.
		for (int i = 0 ; i < args.length ; i++){
			System.out.println(args[i]);
		}    							
	}
}
