package oop2;

public class InnerCall {

	public static void main(String[] args) {
		//���� Ŭ������ �����Ϸ��� ����, 
		//�ܺ� Ŭ������ �ν��Ͻ� ���� �ʿ�
		OuterClass oc = new OuterClass();
		
		OuterClass.MemberInner om 
		  = oc.new MemberInner();
		
		System.out.println("om.mem�� �� : " + om.mem);
		
		System.out.println("����ƽ ���� Ŭ���� ������ �� : " 
						   + OuterClass.StaticInner.stat );
		
		oc.getMethod();
	}

}









