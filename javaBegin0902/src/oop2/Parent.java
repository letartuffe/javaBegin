package oop2;

//클래스를 final로 선언하면 상속 불가능
//public final class Parent {

public class Parent {
	String msg = "부모 클래스의 메시지 변수";
	
	//기본생성자 오버로딩
	//화면에 "부모 클래스의 기본 생성자" 출력
	public Parent(){
		System.out.println("부모 클래스의 기본 생성자가 호출됨");
	}
	
	//문자열 하나를 매개변수로 받아서
	//화면에 입력받은 값을 출력 하는 
	//생성자 오버로딩
	public Parent(String s){
		System.out.println("부모 클래스의 매개변수가 있는 생성자 : " + s);
	}
	
//	메서에 final을 적용하면 상속 받은 클래스에서
//	오버라이딩 불가능
//	public final void printMsg(){
	public void printMsg(){
		System.out.println("부모 클래스의 프린트 메서드가 호출됨");
	}
}

class Child extends Parent{
	String msg = "자식 클래스의 메시지 변수";
	
	//다음 값을 매개변수(hello, parent)로
	//부모 클래스의 생성자를 호출하는 
	//기본 생성자 오버로딩
	public Child(){
		super("hello, parent");
	}
	
	public void printMsg(){
		//부모 클래스의 프린트 메서드 호출
		super.printMsg();	
		System.out.println("자식 클래스의 프린트 메서드가 호출됨");
	}
}
