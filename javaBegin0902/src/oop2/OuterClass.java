package oop2;

public class OuterClass {
	
	//��� ���� Ŭ����
	class MemberInner{
		String mem = "MemberInner";
	}
	
	//����ƽ ���� Ŭ����
	static class StaticInner{
		static String stat = "StaticInner";
	}
	
	public void getMethod(){
		//���� ���� Ŭ����
		class LocalInner{
			String local ="LocalInner";
			
			public void getLocal(){
				System.out.println("�޼��� ���ο� �����" +
						" ���� ���� Ŭ������ ���ڿ� ������ �� : "+
						local);
			}
		}
		
		new LocalInner().getLocal();
	}
}













