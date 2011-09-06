package oop2;

public class ExceptionTest {

	public static void main(String[] args) {
		int a=10, b0=0, b2=2, c=10;

		try{
			c = a / b2; //(1) 	
			System.out.println(" (1) c -> " + c); 

			c = a / b0; //(2) 
			System.out.println(" (2) c -> " + c); 

			c = a / b2; //(3) 
			System.out.println(" (3) c -> " + c); 

			System.out.println(" (4) 정상 종료 " + c);
//		} catch (ArithmeticException ae){
		} catch (ArrayIndexOutOfBoundsException ae){			
			System.out.println("catch 문에 잡힌 c : "+ c);
		} catch (Exception e){
			System.out.println("Exception으로 " +
								"예외 캐취!!");
			e.printStackTrace();
			System.out.println(e);
		} finally{
			System.out.println("예외를 잡거나 못했거나 항상 실행됨!");
		}

	}

}










