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
		//���������� �ִ� �������� ���� Ŭ������ �׼���
		AnnonyInner2 ai = new AnnonyInner2();
		ai.inn.printData();
	}

}





