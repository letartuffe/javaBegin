package oop2.rpg;

//�߻� Ŭ����
public abstract class Player {
	private int x ;
	private int y ;
	
	//������ �Ű����� 2�� �޴� �߻� �޼��� move ���� , ��ȯ�� ����
	abstract void move(int x, int y);
	
	public void stop(int x, int y){
		this.x =x ;
		this.y =y ;
	}
	
	//�������� ���
	public void getXY(String name){
		System.out.println(name+" : ���� x��ǥ : "+x+" | y��ǥ "+y);
	}
}

//player Ŭ���� ���
class Princess extends Player{

	//�θ�Ŭ������ �߻� �ż��带 �������̵�
	//��� �Ѱܹ޴� �Ű������� stop �޼��� ȣ��
	@Override
	void move(int x, int y) {
		stop(x, y);
	}

	public void heal(){
		System.out.println("��~!!");
	}	
	
}
//player Ŭ���� ���
class Shooter extends Player{
	//�θ�Ŭ������ �߻� �ż��带 �������̵�\
	
	@Override
	void move(int x, int y) {
		stop(x,y);
		
	}
	
	public void shot(){
		System.out.println("����");
	}


}

