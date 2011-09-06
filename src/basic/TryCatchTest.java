package basic;




public class TryCatchTest {

	
	public static void main(String[] args) {
	
		 String num = null ;
		 Boolean r= true;
		 while (r){
			 
			 
			 try  {
				 
				 int num1 = Integer.parseInt(num);
				 
				 r= false;
				 
			 } catch (NumberFormatException e){
				 
				 System.out.println("숫자넣으라니까..");
			 }
			 
			 
			 
		 }
		 
	}

}
