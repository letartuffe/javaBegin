package oop2;

public class TrowsTest {

	public static void main(String[] args){
		
		try {
			exp(0);
			
		}catch(NullPointerException ne){
			
			ne.printStackTrace();
		}
	}
	private static void exp(int i) throws NullPointerException{
		if (i==0){
			throw new NullPointerException();
		}
	}
}
