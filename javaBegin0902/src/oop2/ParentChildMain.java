package oop2;

public class ParentChildMain {

	public static void main(String[] args) {
		//Child Ŭ������ �ν��Ͻ� c ����
		Child c = new Child();
		Parent p = new Parent();
		Parent pp = new Child();
		
		//c�� msg �� ���
		System.out.println(c.msg);
		System.out.println(p.msg);
		System.out.println(pp.msg);
		
		//c�� �̿��Ͽ� printMsg�޼��� ȣ��
		c.printMsg();
//		p.printMsg();
//		pp.printMsg();
		
		
	}

}






