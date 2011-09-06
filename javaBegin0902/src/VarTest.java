
public class VarTest {

	public static void main(String[] args) {
		System.out.println("-- println() --");
		System.out.println("0 * 0 = " + (0*0));
		System.out.println("1 * 1 = " + (1*1));
		System.out.println("2 * 2 = " + (2*2));
		System.out.println("3 * 3 = " + (3*3));
		System.out.println("4 * 4 = " + (4*4));
		

		System.out.println("\n-- printf() --");
		System.out.printf("5 * 5 = %d%n", 5*5);
		System.out.printf("6 * 6 = %d%n", 6*6);
		System.out.printf("7 * 7 = %d%n", 7*7);
		System.out.printf("8 * 8 = %d%n", 8*8);
		System.out.printf("9 * 9 = %d%n", 9*9);
		
		
		System.out.println("------------");

		System.out.println(10%7);
		System.out.println(10/7);
		
		System.out.println("------------");
		
		int n;
		
		n = 4;
		
		//int n = 4;
		
		System.out.println( n * 2 + 3 );
	}
}
