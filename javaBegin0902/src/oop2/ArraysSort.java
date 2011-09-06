package oop2;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] score = {20, 4, 12, 1, 5};
		
		//score 배열의 내용을 한 줄로 화면에 출력
		for(int temp : score){
			System.out.print(temp + " ");
		}
		
		System.out.println("\n=============");
		
		//배열의 요소들을 정렬
		Arrays.sort(score);

		//score 배열의 내용을 한 줄로 화면에 출력
		for(int temp : score){
			System.out.print(temp + " ");
		}
		
	}

}







