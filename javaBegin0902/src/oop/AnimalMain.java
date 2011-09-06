package oop;

public class AnimalMain {

	public static void main(String[] args) {
		
		//Animal 클래스의 참조 변수 a 생성
//		Animal 클래스의 객체 a 생성
		Animal a = new Animal();

//		Animal 클래스의 name의 값을 출력
		System.out.println("Animal 클래스의 name : " + a.name);

//		객체a를 매개변수로 addInfo 호출
		addInfo(a);
		
//		Animal 클래스의 이름 출력
		System.out.println("Animal 클래스의 name : " + a.name);
		
		
		
		//Animal의 이름은 "원숭이", 
		//name 변수가 private이라서
		//외부 클래스에서는 접근 할 수 없음.
		// a.name = "원숭이";
		
		//나이는 20살로  만들기
		//a.age = 20;
		
		

	}
	

//	static 메서드 addInfo 작성
//	매개변수 : Animal클래스의 객체
//	수행작업 : Animal클래스의 name의 값을             
//	Lion으로 저장
	static void addInfo(Animal a){
		a.name = "Lion";
	}
}

class Animal{
	String name = "Tiger";
	int age = 20;
}










