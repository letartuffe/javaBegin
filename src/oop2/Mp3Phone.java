package oop2;

public class Mp3Phone extends CellPhone {

	//������ �뷮�� ������ ���� size ����
	//	
	//	�𵨸�,��ȭ��ȣ , ȭ��, ����뷮�� 
	//	�Ű������� �޾Ƽ� �ʱ�ȭ �ϴ� ������.
	
	int size ;
	public Mp3Phone(String model, String number, int chord, int size) {
		this.model = model;
		this.number = number ;
		this.chord = chord;
		this.size = size;
	}
	
	//���� �׳� ����� -  ����ϴ� �޼ҵ�
	public void getMp3Phone(){
		System.out.println(model +", "+chord+", "+number);
	}
	


	
}
