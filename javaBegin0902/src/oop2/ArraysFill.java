package oop2;

import java.util.Arrays;

public class ArraysFill {

	public static void main(String[] args) {
		String[] ar = {"j", "a", "v", "a"};
		for(int i=0 ; i<ar.length ; i++){
			System.out.print(ar[i] + " ");
		}
		System.out.println("\n==================");
		
		//�迭�� ��ҵ��� java�� ä���
		Arrays.fill(ar, "java");
		for(String temp : ar){
			System.out.print(temp + " ");
		}
	}

}
