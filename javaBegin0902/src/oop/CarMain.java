package oop;

public class CarMain {

	public static void main(String[] args) {
		//Car Ŭ������ ���� ���� c1 ����
		Car c1 = new Car();
		
		//�⺻ ������ �̿��Ͽ� 
		// ���, ���� Ÿ����
		// �� 3��¥�� �ڵ��� �����
		c1.color = "���";
		c1.gearType = "����";
		c1.door = 3;
		
		// �Ű������� �ִ� ������ �̿�
		// ���� �ڵ��� �����
		Car c2 = new Car("����");
		
		// ����� �������,�� 2��¥�� 
		// �ڵ��� ����� 
		Car c3 = new Car("���", "����", 2);
		
		
	}

}
