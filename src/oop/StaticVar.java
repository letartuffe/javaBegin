package oop;

public class StaticVar {
	
	char level;
	int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//level은 static이 아니라서 이렇게 값 저장 불가
		//level = 'a';
		
		StaticVar s = new StaticVar();
		s.level ='a';

	}
	

}
