package oop2;

public interface Drawable {
	public static final int PLAIN_PEN = 1;

	//final Ű���尡 ���
	//�������̽��� ����� �������� ��� ���
	int BOLD_PEN = 2;
	int ITALIC_PEN = 3;
	
	//abstract Ű���尡 ���
	//�������̽��� ����� �޼������ ��� �߻� �޼���
	void move(int x, int y);
	abstract void erase(String tool);
}
