package oop2;

public class ThrowsTest {

	public static void main(String[] args) {
		
		//try catch를 이용하여 예외 처리 --> 예외 추적
		try{
			exp(0);
		}catch(NullPointerException ne){
			ne.printStackTrace();
		}
	}

	private static void exp(int i)
						throws NullPointerException{
		if(i == 0){
			//임의로 예외를 발생시킴
			throw new NullPointerException();
		}
	}

}
