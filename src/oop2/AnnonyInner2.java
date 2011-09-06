package oop2;

public class AnnonyInner2 {

	/**
	 * @param args
	 */
	//class 란 말이 없음. 
	//그러나 클래스 한 번 생성. 
	TestAbst inn = new TestAbst(){
		
		public void printData(){
			System.out.println("data : " + data);
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnonyInner2 ai = new AnnonyInner2();
			
	}

}
