package oop;

public class Car {
	String color;
	String gearType;
	int door;

	
	//	��������
	//	
	//	���� �Ű������� �޴� ������ �ۼ�
	//	
	//	���� ���Ÿ�� ���� ������ �Ű������� �޾Ƽ� 
	// ���� �ɹ� ������ �ʱ�ȭ �ϴ� ������ �ۼ�
	
	//	��������
	public Car() {
	}
	
	//���� �Ű������� �޴� ������ �ۼ�	
	public Car(String color) {
		this.color = color;
	}
	//	���� ���Ÿ�� ���� ������ �Ű������� �޾Ƽ� 
	// ���� �ɹ� ������ �ʱ�ȭ �ϴ� ������ �ۼ�	
	public Car(String color, String gearType, int door) {
		//this.color = color;
		//������ �Ű������� �޴� ������ ȣ��.
		this(color);
		this.gearType = gearType;
		this.door = door;
	}
	

	
	
}
