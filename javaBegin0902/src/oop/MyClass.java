package oop;

public class MyClass {
	private String name;
	
	//�Ű������� ���ڿ��� �޴� ������ �����ε�
	public MyClass(String name) {
		this.name = name;
		System.out.println("�����ڷ� �̸� ���� : " + name);
	}

	public void setName(String n){
		name = n;
		System.out.println("setName()�� �̸� ���� : " + name);
	}
}
