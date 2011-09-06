package oop2;

public class ShapeMain {


	public static void main(String[] args) {
		
		// ��ü 3�� ����
		ShapeCircle cicle = new ShapeCircle();
		ShapeRectangle rectagle = new ShapeRectangle();
		ShapeTriangle triangle = new ShapeTriangle();
		
		cicle.draw();
		rectagle.draw();
		triangle.draw();
		
		
		System.out.println("====================================");
		//�߻� Ŭ������ new�� �̿��Ͽ� ��ü�� ������ �� ����.
		//ShapeClass s = new ShapeClass();
		
		//�׷��� �θ� �ڽ����� ��ȯ�ؼ�(��������???) ��ü ����
		ShapeClass s ;
	
		s = triangle;
		s.draw();
		s=cicle;
		s.draw();
		s=rectagle;
		s.draw();
		
		
		// �ڽ��� �θ� �׳� ���� �� ����. ĳ����-�ٿ� ĳ����. 
		//triangle = s;
		//triangle = (ShapeTriangle) s;
		//triangle.draw();
		
		
		
		//instanceof ����
		//�ڿ� �ִ� Ŭ������ instance�ΰ� ���Ͽ� Ȯ��..
		if(triangle instanceof Object){
			System.out.println("triangle�� Object�� �ν��Ͻ�");
		}
		
		if(triangle instanceof ShapeClass){
			System.out.println("triangle�� ShapeClass�� �ν��Ͻ�");
		} 

		if(triangle instanceof ShapeTriangle){
			System.out.println("triangle�� ShapeTriangel�� �ν��Ͻ�");
		}
	}

}
