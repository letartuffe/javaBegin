package oop2;

//�������̵� ����
//Parant.java
//ParentChildMain.java

public class Parent {
//public final class Parent {   Ŭ������ final�� �����ϸ� ��� �Ұ���.
	/**
	 * @param msg
	 */



	String msg = "�θ� Ŭ������ �޼��� ����";
	
	//�⺻������ �����ε�
	//ȭ�鿡 "�θ�Ŭ������ �⺻ ������" ���.
	
	public Parent() {
		System.out.println("�θ�Ŭ������ �⺻ ������");
	}

	public Parent(String msg) {
	//public final Parent(String msg) {  final �� ��ӹ��� Ŭ�������� �������̵� �Ұ�.
		
		
		//this.msg = msg;
		System.out.println("�θ�.. ������..�Ű�����"+msg);
	}
	
	
	public void printMsg(){
		System.out.println("�θ�Ŭ������ printMsg()�� ȣ���");
		
	}
}

//�ٸ� ���Ͽ� ������.
class Child extends Parent {
	/**
	 * 
	 */
	public Child() {
		super("hello, parents");
		// TODO Auto-generated constructor stub
	}



	


	String msg = "�ڽ� Ŭ������ �޼��� ����";
	

	//
	//"hello, parent"�Ű� ������ 
	//�θ� Ŭ������ �����ڸ� ȣ���ϴ� �⺻ ������ �����ε�
	//	
	
	
	
	
	
	public void printMsg(){
		super.printMsg();
		System.out.println("�ڽ� Ŭ������ printMsg()�� ȣ���");
	}
	
	
	
}