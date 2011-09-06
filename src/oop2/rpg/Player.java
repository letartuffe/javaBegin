package oop2.rpg;

//추상 클래스
public abstract class Player {
	private int x ;
	private int y ;
	
	//정수형 매개변수 2개 받는 추상 메서드 move 선언 , 반환값 없음
	abstract void move(int x, int y);
	
	public void stop(int x, int y){
		this.x =x ;
		this.y =y ;
	}
	
	//현재위차 출력
	public void getXY(String name){
		System.out.println(name+" : 현재 x좌표 : "+x+" | y좌표 "+y);
	}
}

//player 클래스 상속
class Princess extends Player{

	//부모클래스의 추상 매서드를 오버라이딩
	//기능 넘겨받는 매개변수로 stop 메서드 호출
	@Override
	void move(int x, int y) {
		stop(x, y);
	}

	public void heal(){
		System.out.println("힐~!!");
	}	
	
}
//player 클래스 상속
class Shooter extends Player{
	//부모클래스의 추상 매서드를 오버라이딩\
	
	@Override
	void move(int x, int y) {
		stop(x,y);
		
	}
	
	public void shot(){
		System.out.println("빵빵");
	}


}

