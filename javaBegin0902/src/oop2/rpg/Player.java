package oop2.rpg;

//1.Player�� �߻� Ŭ����
public abstract class Player {
	private int x;
	private int y;
	
	//2.������ �Ű����� 2���� �޴� 
	//  �߻� �޼��� move ���� 
	//  (��ȯ���� ����)
	abstract void move(int x, int y);
	
	
	//��ġ ���� �޼���
	public void stop(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//���� ��ġ�� ����ϴ� �޼���
	public void getXY(String name){
		System.out.println(name + "�� ���� X��ǥ : " + x
						   +" |Y��ǥ : " + y);
	}
}

//3.Plyaer Ŭ������ ��� �ޱ�
class Princess extends Player{
	//3-1.�θ� Ŭ������ �߻� �޼��带 �������̵�
	//��� : �Ѱܹ޴� �Ű������� stop �޼��� ȣ��
	@Override
	void move(int x, int y) {
		stop(x, y);
	}
	
	public void heal(){
		System.out.println("������ heal �޼��� ȣ���");
	}
}

//4.Plyaer Ŭ������ ��� �ޱ�
class Shooter extends Player{
	//4-1.�θ� Ŭ������ �߻� �޼��带  �������̵�  
	//��� : �Ѱܹ޴� �Ű������� stop �޼��� ȣ��
	@Override
	void move(int x, int y) {
		stop(x, y);
	}

	public void shot(){
		System.out.println("������ shot �޼��� ȣ���");
	}
}
