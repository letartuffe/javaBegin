package oop2;

import java.util.Arrays;

//배열생성
//Array 클래스 연습


public class ArrayFill {

	
	public static void main(String[] args) {
		String[] ar = {"j","a","v","a"};
		
		for (int i = 0 ; i < ar.length ; i++){
			System.out.print(ar[i]+" ");
		}
		
		//fill method - 배열요소 채우기
		Arrays.fill(ar, "java");
		
		//foreach 개선된 루프
		for(String temp : ar){
			System.out.println(temp + " ");
		}
	}

}
