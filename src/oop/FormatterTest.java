package oop;

import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {
		Formatter f = new Formatter();
		f.format("%1$b, %2$5s, %3$h", false, "sasdfasdf", 500);
		
		System.out.println(f);
		

	}

}
