package oop2;

public interface Drawable {
	public static final int PLAIN_PEN = 1;

	//final 키워드가 없어도
	//인터페이스에 선언된 변수들은 모두 상수
	int BOLD_PEN = 2;
	int ITALIC_PEN = 3;
	
	//abstract 키워드가 없어도
	//인터페이스에 선언된 메서드들은 모두 추상 메서드
	void move(int x, int y);
	abstract void erase(String tool);
}
