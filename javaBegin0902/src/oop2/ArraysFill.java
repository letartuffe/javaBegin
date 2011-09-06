package oop2;

import java.util.Arrays;

public class ArraysFill {

	public static void main(String[] args) {
		String[] ar = {"j", "a", "v", "a"};
		for(int i=0 ; i<ar.length ; i++){
			System.out.print(ar[i] + " ");
		}
		System.out.println("\n==================");
		
		//배열의 요소들을 java로 채우기
		Arrays.fill(ar, "java");
		for(String temp : ar){
			System.out.print(temp + " ");
		}
	}

}
