package oop2;

public class AnnonyInner2 {

	TestAbst inn = new TestAbst(){
		@Override
		public void printData() {
			System.out.println("data : "
						       + data);
		}
	};
	
	public static void main(String[] args) {
		//참조변수가 있는 유형으로 내부 클래스에 액세스
		AnnonyInner2 ai = new AnnonyInner2();
		ai.inn.printData();
	}

}





