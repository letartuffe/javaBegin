package oop2;

//Ŭ������ final�� �����ϸ� ��� �Ұ���
//public final class Parent {

public class Parent {
	String msg = "�θ� Ŭ������ �޽��� ����";
	
	//�⺻������ �����ε�
	//ȭ�鿡 "�θ� Ŭ������ �⺻ ������" ���
	public Parent(){
		System.out.println("�θ� Ŭ������ �⺻ �����ڰ� ȣ���");
	}
	
	//���ڿ� �ϳ��� �Ű������� �޾Ƽ�
	//ȭ�鿡 �Է¹��� ���� ��� �ϴ� 
	//������ �����ε�
	public Parent(String s){
		System.out.println("�θ� Ŭ������ �Ű������� �ִ� ������ : " + s);
	}
	
//	�޼��� final�� �����ϸ� ��� ���� Ŭ��������
//	�������̵� �Ұ���
//	public final void printMsg(){
	public void printMsg(){
		System.out.println("�θ� Ŭ������ ����Ʈ �޼��尡 ȣ���");
	}
}

class Child extends Parent{
	String msg = "�ڽ� Ŭ������ �޽��� ����";
	
	//���� ���� �Ű�����(hello, parent)��
	//�θ� Ŭ������ �����ڸ� ȣ���ϴ� 
	//�⺻ ������ �����ε�
	public Child(){
		super("hello, parent");
	}
	
	public void printMsg(){
		//�θ� Ŭ������ ����Ʈ �޼��� ȣ��
		super.printMsg();	
		System.out.println("�ڽ� Ŭ������ ����Ʈ �޼��尡 ȣ���");
	}
}
