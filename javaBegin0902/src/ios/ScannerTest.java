package ios;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		System.out.print("�Է� : " );
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.printf("��ĵ : %d", number);
		scan.close();
	}

}
