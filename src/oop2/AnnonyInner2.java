package oop2;

public class AnnonyInner2 {

	/**
	 * @param args
	 */
	//class �� ���� ����. 
	//�׷��� Ŭ���� �� �� ����. 
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
