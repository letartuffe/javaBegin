package oop2;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] score = {20, 4, 12, 1, 5};
		
		//score �迭�� ������ �� �ٷ� ȭ�鿡 ���
		for(int temp : score){
			System.out.print(temp + " ");
		}
		
		System.out.println("\n=============");
		
		//�迭�� ��ҵ��� ����
		Arrays.sort(score);

		//score �迭�� ������ �� �ٷ� ȭ�鿡 ���
		for(int temp : score){
			System.out.print(temp + " ");
		}
		
	}

}







