package oop2;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] score = {20, 4, 12, 1, 5};
		
		for (int temp : score){
			System.out.print(temp+" ");
		}
		
		//�迭�� ��ҵ��� ����
		Arrays.sort(score);
		for (int temp : score){
			System.out.print(temp+" ");
		}

		
		
	}

}
