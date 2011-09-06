package oop2.collect;

public class GeneralEXmain {

	public static void main(String[] args) {
		//GenericEX 클래스의 인스턴스 t생성
		//GenericEX<T> t = new GenericEX<T>();
		GenericEX<String> t = new GenericEX<String>();
	
		
		String[] ss = {"아", "이", "우"};
		
		t.set(ss);
		t.print();		
	}

	
	

}
