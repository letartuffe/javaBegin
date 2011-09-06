package oop2;

public interface Drawable {
	
	
	public final int PLAIN_PEN = 1;
	//�������̽��� ����� �������� ��� ���
	//final ���..
	int BOLD_PEN = 2;
	int ITALIC_PEN = 3;
	
	//�������̽����� ����� �޼���� ��� �߻� �޼���
	//abstract�� ���..
	//��⼭ �߻�޼���� �����س����� 
	//�ٸ� Ŭ�������� implements�ϰ�,
	//�޼��带�������̵��Ͽ� ������. 
	void move(int x, int y);
	
	abstract void erase(String tool);
}
