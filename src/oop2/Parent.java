package oop2;

//오버라이딩 연슴
//Parant.java
//ParentChildMain.java

public class Parent {
//public final class Parent {   클래스를 final로 선언하면 상속 불가능.
	/**
	 * @param msg
	 */



	String msg = "부모 클래스의 메세지 변수";
	
	//기본생성자 오버로딩
	//화면에 "부모클래스의 기본 생성자" 출력.
	
	public Parent() {
		System.out.println("부모클래스의 기본 생성자");
	}

	public Parent(String msg) {
	//public final Parent(String msg) {  final 시 상속받은 클래스에서 오버라이딩 불가.
		
		
		//this.msg = msg;
		System.out.println("부모.. 생성자..매개변수"+msg);
	}
	
	
	public void printMsg(){
		System.out.println("부모클래스의 printMsg()가 호출됨");
		
	}
}

//다른 파일에 만들어도됨.
class Child extends Parent {
	/**
	 * 
	 */
	public Child() {
		super("hello, parents");
		// TODO Auto-generated constructor stub
	}



	


	String msg = "자식 클래스의 메세지 변수";
	

	//
	//"hello, parent"매개 변수로 
	//부모 클래스의 생성자를 호출하는 기본 생성자 오버로딩
	//	
	
	
	
	
	
	public void printMsg(){
		super.printMsg();
		System.out.println("자식 클래스의 printMsg()가 호출됨");
	}
	
	
	
}