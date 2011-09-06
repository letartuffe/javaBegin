package basic;

public class ThreadExtendsTest 
			extends Thread{
		
	@Override
	public void run() {
		//�������� �̸��� ��� Ƚ���� 5�� ǥ��
		for(int i=1 ; i<=5 ; i++){
			System.out.println(getName() + " : " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadExtendsTest t1;
		ThreadExtendsTest t2;

		t1= new ThreadExtendsTest();		
		t2= new ThreadExtendsTest();
		
		t1.setName("ù° ������");
		t2.setName("��° ������");
		
		t1.start();
		t2.start();
		
		System.out.println("--- ���� �޼��� ���� ---");
	}
}







