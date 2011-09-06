package ios;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		System.out.print("ÀÔ·Â : " );
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.printf("½ºÄµ : %d", number);
		scan.close();
	}

}
