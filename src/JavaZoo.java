public class JavaZoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//arguements �� ������ string���� args�� ����
		
		
		System.out.println("==========Java Zoo=========");
		System.out.println(args.length+"���� ������� �����������");
		
		//.length �̿�� ���ǻ���. -- 1���� ����.
		for (int i = 0 ; i < args.length ; i++){
			System.out.println(args[i]);
		}    							
	}
}
