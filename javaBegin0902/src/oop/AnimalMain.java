package oop;

public class AnimalMain {

	public static void main(String[] args) {
		
		//Animal Ŭ������ ���� ���� a ����
//		Animal Ŭ������ ��ü a ����
		Animal a = new Animal();

//		Animal Ŭ������ name�� ���� ���
		System.out.println("Animal Ŭ������ name : " + a.name);

//		��üa�� �Ű������� addInfo ȣ��
		addInfo(a);
		
//		Animal Ŭ������ �̸� ���
		System.out.println("Animal Ŭ������ name : " + a.name);
		
		
		
		//Animal�� �̸��� "������", 
		//name ������ private�̶�
		//�ܺ� Ŭ���������� ���� �� �� ����.
		// a.name = "������";
		
		//���̴� 20���  �����
		//a.age = 20;
		
		

	}
	

//	static �޼��� addInfo �ۼ�
//	�Ű����� : AnimalŬ������ ��ü
//	�����۾� : AnimalŬ������ name�� ����             
//	Lion���� ����
	static void addInfo(Animal a){
		a.name = "Lion";
	}
}

class Animal{
	String name = "Tiger";
	int age = 20;
}










