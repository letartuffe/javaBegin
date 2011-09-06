package oop;

public class SumAll {

	public static void main(String[] args) {
		System.out.println(sumAll(10,20,30));
		System.out.println("===========");
		System.out.println(sum(10,20,30));
	}

	//VarArgs를 이용하여 처리
	private static int sum(int ... n) {
		int total = 0; 
		
		for(int i=0 ; i<n.length ; i++){
			total = total + n[i];
			// total += n[i];
		}
		
		return total;
	}

	private static int sumAll(int i, int j, int k) {

		return i + j + k;
	}

}
