package oop2.rpg;

//1.Player는 추상 클래스
public abstract class Player {
	private int x;
	private int y;
	
	//2.정수형 매개변수 2개를 받는 
	//  추상 메서드 move 선언 
	//  (반환값은 없음)
	abstract void move(int x, int y);
	
	
	//위치 지정 메서드
	public void stop(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//현재 위치를 출력하는 메서드
	public void getXY(String name){
		System.out.println(name + "의 현재 X좌표 : " + x
						   +" |Y좌표 : " + y);
	}
}

//3.Plyaer 클래스를 상속 받기
class Princess extends Player{
	//3-1.부모 클래스의 추상 메서드를 오버라이딩
	//기능 : 넘겨받는 매개변수로 stop 메서드 호출
	@Override
	void move(int x, int y) {
		stop(x, y);
	}
	
	public void heal(){
		System.out.println("공주의 heal 메서드 호출됨");
	}
}

//4.Plyaer 클래스를 상속 받기
class Shooter extends Player{
	//4-1.부모 클래스의 추상 메서드를  오버라이딩  
	//기능 : 넘겨받는 매개변수로 stop 메서드 호출
	@Override
	void move(int x, int y) {
		stop(x, y);
	}

	public void shot(){
		System.out.println("슈터의 shot 메서드 호출됨");
	}
}
