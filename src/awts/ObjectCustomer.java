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
	
	
	// �ǹ������� setter / getter �ۼ�
	
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
		return "���� : " +name +"   ���� :  "+ age ;
	}
	
	
	//objectCustomer Ŭ������ ��ü�� ��������� ������ ���� ��µǵ��� �ʿ��� �޼��� �������̵�
	//[���� : �ĤĤ� (��)]


}
