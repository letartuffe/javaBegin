package oop2;

public class ShapeMain {

	public static void main(String[] args) {
		ShapeCircle c = new ShapeCircle();
		ShapeTriangle t = new ShapeTriangle();
		ShapeRectangle r = new ShapeRectangle();
		
		c.draw();
		t.draw();
		r.draw();
		
//		�߻�(abstract) Ŭ������ new�� �̿��Ͽ� 
//		��ü�� ������ �� ����.
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
			System.out.println("t�� ShapeClass�� �ν��Ͻ�");
		}
		
		if(t instanceof ShapeTriangle){
			System.out.println("t�� ShapeTriangle�� �ν��Ͻ�");
		}
		
		if(t instanceof Object){
			System.out.println("t�� Object�� �ν��Ͻ�");
		}
	}

}







