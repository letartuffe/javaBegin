package oop2;

public class AnnoyInner {
	
	public void test(){
		
		new TestInter(){

			@Override
			public void printData() {
				System.out.println("DATA : "+DATA);
			}
			
		}.printData();
		
	}
	
	public static void main(String[] args) {
		//����Ŭ������ �̸��� ���������� ���� ���� Ŭ���� ������ ����ϱ�
		
		new AnnoyInner().test();
	}

}
