package oop2;

public class OuterClass {
	//�ɹ� ���� Ŭ���� .
	class MemberInner{
		
		String mem = "MemberInner";
	}
	//static ���� Ŭ����
	static class StaticInner{
		static String stat = "StaticInner";
	}
	
	public void getMethod(){
		//���� ���� Ŭ����
		class LocalInner{
			
			String local = "LocalInner";
			
			public void getLocal(){
				System.out.println("�޼��� ���ο� ����� ���ó��� Ŭ������ ���天 �ź����� �� : " + local );
				
			}
		}
		new LocalInner().getLocal();
	}
}