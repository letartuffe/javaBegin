package oop2.collect;

public class GenericEXmain {

	public static void main(String[] args) {
		//(제네릭을 적용하여)
		//GenericEX 클래스의 인스턴스 t 생성
		GenericEX<String> t = new GenericEX<String>();
		
		//문자열 배열에 아, 이, 우 저장
		String[] ss = {"아", "이", "우"};
		
		//t를 이용하여 set 메서드 호출
		t.set(ss);
		
		//t를 이용하여 print 메서드 호출
		t.print();
		
	}

}
