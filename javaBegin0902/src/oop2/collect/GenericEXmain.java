package oop2.collect;

public class GenericEXmain {

	public static void main(String[] args) {
		//(���׸��� �����Ͽ�)
		//GenericEX Ŭ������ �ν��Ͻ� t ����
		GenericEX<String> t = new GenericEX<String>();
		
		//���ڿ� �迭�� ��, ��, �� ����
		String[] ss = {"��", "��", "��"};
		
		//t�� �̿��Ͽ� set �޼��� ȣ��
		t.set(ss);
		
		//t�� �̿��Ͽ� print �޼��� ȣ��
		t.print();
		
	}

}
