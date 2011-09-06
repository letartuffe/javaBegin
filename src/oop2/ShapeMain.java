package oop2;

public class ShapeMain {


	public static void main(String[] args) {
		
		// 객체 3개 생성
		ShapeCircle cicle = new ShapeCircle();
		ShapeRectangle rectagle = new ShapeRectangle();
		ShapeTriangle triangle = new ShapeTriangle();
		
		cicle.draw();
		rectagle.draw();
		triangle.draw();
		
		
		System.out.println("====================================");
		//추상 클래스는 new를 이용하여 객체를 생성할 수 없다.
		//ShapeClass s = new ShapeClass();
		
		//그래서 부모를 자식으로 변환해서(폴리모프???) 객체 생성
		ShapeClass s ;
	
		s = triangle;
		s.draw();
		s=cicle;
		s.draw();
		s=rectagle;
		s.draw();
		
		
		// 자식을 부모에 그냥 담을 수 없음. 캐스팅-다운 캐스팅. 
		//triangle = s;
		//triangle = (ShapeTriangle) s;
		//triangle.draw();
		
		
		
		//instanceof 연습
		//뒤에 있는 클래스의 instance인가 비교하여 확인..
		if(triangle instanceof Object){
			System.out.println("triangle는 Object의 인스턴스");
		}
		
		if(triangle instanceof ShapeClass){
			System.out.println("triangle는 ShapeClass의 인스턴스");
		} 

		if(triangle instanceof ShapeTriangle){
			System.out.println("triangle는 ShapeTriangel의 인스턴스");
		}
	}

}
