package oop2;

//Drawable �������̽� ����
public class ShapeCircle extends ShapeClass 
						 implements Drawable{

	@Override
	void draw() {
		System.out.println("���� �׸���");
	}

	@Override
	public void move(int x, int y) {}

	@Override
	public void erase(String tool) {
		System.out.println(tool + "�� �����");
		
	}

}
