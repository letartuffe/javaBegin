package oop2;

import java.util.Arrays;

//�迭����
//Array Ŭ���� ����


public class ArrayFill {

	
	public static void main(String[] args) {
		String[] ar = {"j","a","v","a"};
		
		for (int i = 0 ; i < ar.length ; i++){
			System.out.print(ar[i]+" ");
		}
		
		//fill method - �迭��� ä���
		Arrays.fill(ar, "java");
		
		//foreach ������ ����
		for(String temp : ar){
			System.out.println(temp + " ");
		}
	}

}
