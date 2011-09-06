package oop2;

//Drawable 인터페이스 구현
public class ShapeCircle extends ShapeClass 
						 implements Drawable{

	@Override
	void draw() {
		System.out.println("원을 그린다");
	}

	@Override
	public void move(int x, int y) {}

	@Override
	public void erase(String tool) {
		System.out.println(tool + "로 지우기");
		
	}

}
