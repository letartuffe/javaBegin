package oop;

public class ConstructorTest {

	public static void main(String[] args) {
		
		//생성자를 추가했기 때문에
		//기본생성자 호출은 안됨.
		//필요시 기본생성자 오버로딩해서 사용
		//MyClass m = new MyClass();
		
		//이름을 "KIM"으로 지정하여 MyClass의 인스턴스 m 생성
		MyClass m = new MyClass("KIM");
		
		//MyClass의 setName 메서드를 호출하여 
		//이름을 "LEE"로 지정
		m.setName("LEE");
		
	}

}







