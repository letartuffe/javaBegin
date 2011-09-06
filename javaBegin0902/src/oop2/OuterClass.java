package oop2;

public class OuterClass {
	
	//멤버 내부 클래스
	class MemberInner{
		String mem = "MemberInner";
	}
	
	//스태틱 내부 클래스
	static class StaticInner{
		static String stat = "StaticInner";
	}
	
	public void getMethod(){
		//로컬 내부 클래스
		class LocalInner{
			String local ="LocalInner";
			
			public void getLocal(){
				System.out.println("메서드 내부에 선언된" +
						" 로컬 내부 클래스의 문자열 변수의 값 : "+
						local);
			}
		}
		
		new LocalInner().getLocal();
	}
}













