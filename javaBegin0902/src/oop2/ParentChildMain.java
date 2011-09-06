package oop2;

public class ParentChildMain {

	public static void main(String[] args) {
		//Child 클래스의 인스턴스 c 생성
		Child c = new Child();
		Parent p = new Parent();
		Parent pp = new Child();
		
		//c의 msg 값 출력
		System.out.println(c.msg);
		System.out.println(p.msg);
		System.out.println(pp.msg);
		
		//c를 이용하여 printMsg메서드 호출
		c.printMsg();
//		p.printMsg();
//		pp.printMsg();
		
		
	}

}






