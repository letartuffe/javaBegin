package oop;

public class AnimalMain {
	public static void main(String[] args) {

		/*
		//Animal 클래서 참조 변수 a 선언&생성 한줄
		
		Animal a = new Animal();
		
		//Animal의 이름은 "원숭이",
		//나이는 20살로 만들기.
		
		//a.name = "원숭이";   > private 때문에 사용할 수 없음.
		a.age = 20 ;
		*/
		
		// 객체 = 참조변수 = 인스턴스 만들기
		Animal a = new Animal();
		
		System.out.println(a.name);
		
		//객체를 생성 할필요가 없이 그냥 a.name값을 호출하여 변경할 수 있음.
		addInfo(a);
		System.out.println(a.name);
	}
	
	//객체 받기.. int interest 처럼 그냥 Animal a 로 받으면 됨.
	static void addInfo(Animal a){
		a.name = "lion";
	}
}

class Animal{
	
	//String name ;
	//private String name;  //<--- private 접근제한자 - Anmimal객체 내부에서만 사용가능
	String name = "Tiger";
	int age = 20;
}