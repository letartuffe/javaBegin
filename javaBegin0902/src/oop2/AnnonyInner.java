package oop2;

public class AnnonyInner {
	
	public void test(){
		
		new TestInter(){
			@Override
			public void printData() {
				System.out.println("DATA : "
								+ DATA);
			}
		}.printData();
		
	}
	
	
	public static void main(String[] args) {
		//���� Ŭ������ �̸��� ���������� ���� ���� Ŭ���� ����
		//�� ����ϱ�
		new AnnonyInner().test();
	}

}












