package oop;

public class ConstructorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름을 "kim"으로 지정하여 MyClass의 인스턴스 m 생성
		
		//생성자가 있으므로 아래와 같이 사용 불가
		//MyClass m = new MyClass();
		//필요하면 기본 생성자 만들면 됨.
		
		MyClass m = new MyClass("kim");
		
		//System.out.println(m.);
		//MyClass의 setName 메서드를 호출하여
		//이름을 "LEE"로 지정
		
		m.setName("Lee");
		
	}

}
