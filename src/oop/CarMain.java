package oop;

//�⺻ ������ �̿�
//Car Ŭ������ ���� ����  c1 ����
//�⺻ ������ �̿��Ͽ� ���, ���� Ÿ���� �� 3�� ¥�� �ڵ��� �����.

public class CarMain {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "���";
		c1.gearType = "����";
		c1.door = 3;
		
		//�Ű������� �ִ� ������ �̿�
		//���� �ڵ��� �����
		
		Car c2 = new Car("����");
				
		//����� �������, ��2�� ¥���ڵ��������
		Car c3 = new Car("�","����",2);
		
		
	}
}
