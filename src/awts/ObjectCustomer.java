package ios;

import java.io.Serializable;

import awts.AwtTest;

public class ObjectCustomer implements Serializable{

	private String name ;
	private int age ;
	
	
	public ObjectCustomer(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	
	// 맨버변수의 setter / getter 작성
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public String toString(){
		return "고객명 : " +name +"   나이 :  "+ age ;
	}
	
	
	//objectCustomer 클래스의 객체를 출력했을때 다음과 같이 출력되도록 필요한 메서드 오버라이딩
	//[고객명 : ㅔㅔㅔ (세)]


}
