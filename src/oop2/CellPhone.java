package oop2;

public class CellPhone {
	
	//�Ӽ�, ������Ƽ
	//�𵨸� ��ȭ ��ȣ ȭ��
	String model;
	String number;
	int chord;
	
	//��ȭ��ȣ�� �����ϴ� setter
	public void setNumber(String number){
		this.number = number;
	}
	
	//�𵨸�, ��ȭ��ȣ, ȭ���� ��ȯ�ϴ� getter �ۼ�
	public String getModel(){
		return model;
	}
	public String getNumber(){
		return number;
	}
	public int getChord(){
		return chord;
	}
	
}
