package oop2;

public abstract class ShapeClass {
	//매개변수와 반환형이 없는 추상 메서드 draw 선언
	abstract void draw();
	
	public void printShape(){
		System.out.println("도형 그리기");
	}
}
