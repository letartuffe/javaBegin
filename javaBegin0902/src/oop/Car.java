package oop;

public class Car {
	String color;
	String gearType;
	int door;

	// �⺻ ������ ���� ����
	public Car(){}
	
	
	// ������ �Ű������� �޾Ƽ�
	// color�� �ʱ�ȭ�ϴ� ������ �ۼ�
	public Car(String color){
		this.color = color;
	}

	// ����, ���Ÿ��, ���� ������ 
	// �Ű� ������ �޾Ƽ�
	// ���� ��� ������ �ʱ�ȭ�ϴ� 
	// ������ �ۼ�	
	public Car(String color, String gearType, int door) {
		//this.color = color;
		//������ �Ű������� �޴� ������ ȣ��
		this(color);
		
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	
	
	

}
