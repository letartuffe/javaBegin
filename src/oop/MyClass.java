package oop;

public class MyClass {	
	
	private String name;

	/**
	 * @param name
	 */
	//매개 변수로 문자열을 받는 생성자 오버로딩.
	public MyClass(String name) {
		this.name = name;
		System.out.println("생성자로 이름 설정:" + name);
	}




	/**
	 * @param args
	 */

	
	public void setName(String n){
		name = n;
		System.out.println("setName()로 이름 설정:"+name);
	}

}
