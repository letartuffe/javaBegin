package oop2;

//������. enum. Ŭ����.
//�������� ���� ���� ����.
public class EnumTest1 {
	
	public enum Lesson {
		java, xml, ejb
	}
	public static void main(String[] args) {
		Lesson l = Lesson.java;
		System.out.println(l);
	}

}
