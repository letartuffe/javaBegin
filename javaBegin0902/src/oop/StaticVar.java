package oop;

public class StaticVar {
	char level;
	static int count;
	
	public static void main(String[] args) {
//		level은 static이 아니라서 
//		이렇게 값 저장 불가
//		level = 'a';	
					
//		그래서 참조변수가 필요
		StaticVar s = new StaticVar();
		s.level = 'a';
		
		count = 100;
	}

}
