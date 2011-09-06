package oop2;

public class ShapeMain {

	public static void main(String[] args) {
		ShapeCircle c = new ShapeCircle();
		ShapeTriangle t = new ShapeTriangle();
		ShapeRectangle r = new ShapeRectangle();
		
		c.draw();
		t.draw();
		r.draw();
		
//		추상(abstract) 클래스는 new를 이용하여 
//		객체를 생성할 수 없다.
//		ShapeClass s = new ShapeClass();
		
		System.out.println("===============");
		
		ShapeClass s = r;
		s.draw();
		
		s = c;
		s.draw();
		
		s = t;
		s.draw();

		System.out.println("===============");
		t = (ShapeTriangle) s;
		t.draw();

		System.out.println("===============");
		if(t instanceof ShapeClass){
			System.out.println("t는 ShapeClass의 인스턴스");
		}
		
		if(t instanceof ShapeTriangle){
			System.out.println("t는 ShapeTriangle의 인스턴스");
		}
		
		if(t instanceof Object){
			System.out.println("t는 Object의 인스턴스");
		}
	}

}







