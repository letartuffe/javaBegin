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

			System.out.println(" (4) ���� ���� " + c);
//		} catch (ArithmeticException ae){
		} catch (ArrayIndexOutOfBoundsException ae){			
			System.out.println("catch ���� ���� c : "+ c);
		} catch (Exception e){
			System.out.println("Exception���� " +
								"���� ĳ��!!");
			e.printStackTrace();
			System.out.println(e);
		} finally{
			System.out.println("���ܸ� ��ų� ���߰ų� �׻� �����!");
		}

	}

}










