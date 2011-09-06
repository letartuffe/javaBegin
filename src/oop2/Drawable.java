package oop2;

public interface Drawable {
	
	
	public final int PLAIN_PEN = 1;
	//인터페이스에 선언된 변수들은 모두 상수
	//final 없어도..
	int BOLD_PEN = 2;
	int ITALIC_PEN = 3;
	
	//인터페이스에서 선언된 메서드는 모두 추상 메서드
	//abstract가 없어도..
	//요기서 추상메서드로 선언해놓으면 
	//다른 클래스에서 implements하고,
	//메서드를오버라이딩하여 구현함. 
	void move(int x, int y);
	
	abstract void erase(String tool);
}
