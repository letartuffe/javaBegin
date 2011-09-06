package oop2;

public class EnumTest {

	public enum Lesson {
		JAVA, XML, EJB
	}
	
	public static void main(String[] args) {
		Lesson l = Lesson.JAVA;
		
		System.out.println("lÀÇ °ª : " + l);
	}

}
