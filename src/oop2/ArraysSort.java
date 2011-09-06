package oop2;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] score = {20, 4, 12, 1, 5};
		
		for (int temp : score){
			System.out.print(temp+" ");
		}
		
		//배열의 요소들을 정렬
		Arrays.sort(score);
		for (int temp : score){
			System.out.print(temp+" ");
		}

		
		
	}

}
