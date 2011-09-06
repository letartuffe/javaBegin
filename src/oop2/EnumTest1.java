package oop2;

//열거형. enum. 클래스.
//정해진거 갖다 쓸수 있음.
public class EnumTest1 {
	
	public enum Lesson {
		java, xml, ejb
	}
	public static void main(String[] args) {
		Lesson l = Lesson.java;
		System.out.println(l);
	}

}
