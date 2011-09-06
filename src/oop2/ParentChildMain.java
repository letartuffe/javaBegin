package oop2;

public class ParentChildMain {

	public static void main(String[] args) {
		//Child클래스의 인스턴스 c 생성
		Child c = new Child();
		//c의 msg값출력
		System.out.println(c.msg);
		//c를 이용하여 printMsg 호출
		c.printMsg();
		
		//위와 똑같이 
		Parent p = new Parent();
		System.out.println(p.msg);
		//p.printMsg();
		
		Parent pp = new Child(); //부모를 자식타입으로 변환
		System.out.println(pp.msg); //변수 부모변수..
		//pp.printMsg(); //메소드는 자식 메소드가 실행
	}

}
