package oop;

public class StaticBlock {
	int a;
	static String s;
	
	//static 블럭
	static{
		System.out.println(s);
		System.out.println("여기는 static 초기화 블럭");
		s = "초기화 진행 중....";
	}
	
	public static void main(String[] args) {
		System.out.println("여기는 main 메서드 블럭");
		System.out.println(s);
		
	}

}
