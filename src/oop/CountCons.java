package oop;

public class CountCons {
	
	//static을 안 붙이면 인스턴스 수가 1,1,1, 이렇게 나옴. 
	//new 생성한 객체가 각각의 count값을 가지고 있는거임
	//객체가 공유할려면 static을 붙여줘야.
	static int count  ;


	public CountCons() {
		count++;
		//count = count + 1;
		System.out.println("현재 생성된 인스턴스수 : " + count);
	}
	
}
