package oop2.collect;

public class GeneralEXmain {

	public static void main(String[] args) {
		//GenericEX Ŭ������ �ν��Ͻ� t����
		//GenericEX<T> t = new GenericEX<T>();
		GenericEX<String> t = new GenericEX<String>();
	
		
		String[] ss = {"��", "��", "��"};
		
		t.set(ss);
		t.print();		
	}

	
	

}
