package oop2;

public class ParentChildMain {

	public static void main(String[] args) {
		//ChildŬ������ �ν��Ͻ� c ����
		Child c = new Child();
		//c�� msg�����
		System.out.println(c.msg);
		//c�� �̿��Ͽ� printMsg ȣ��
		c.printMsg();
		
		//���� �Ȱ��� 
		Parent p = new Parent();
		System.out.println(p.msg);
		//p.printMsg();
		
		Parent pp = new Child(); //�θ� �ڽ�Ÿ������ ��ȯ
		System.out.println(pp.msg); //���� �θ𺯼�..
		//pp.printMsg(); //�޼ҵ�� �ڽ� �޼ҵ尡 ����
	}

}
