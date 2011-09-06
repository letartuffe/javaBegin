package oop2;

public class InnerCall {

	public static void main(String[] args) {
		//내부 클래스에 접근하려면 먼저, 
		//외부 클래스의 인스턴스 생성 필요
		OuterClass oc = new OuterClass();
		
		OuterClass.MemberInner om 
		  = oc.new MemberInner();
		
		System.out.println("om.mem의 값 : " + om.mem);
		
		System.out.println("스태틱 내부 클래스 변수의 값 : " 
						   + OuterClass.StaticInner.stat );
		
		oc.getMethod();
	}

}









