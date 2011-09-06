package oop;

public class CountCons {
	static int count;
	
	public CountCons(){
		count++;
		System.out.println("현재 생성된 인스턴스의 수 "
						   + count);
	}
}
