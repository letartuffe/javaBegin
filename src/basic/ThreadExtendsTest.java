package basic;

public class ThreadExtendsTest extends Thread {
	
	
	
	@Override
	public void run() {
		//쓰레드으 이름과 출력횟수를 5번 표시.
		
		for (int i = 0 ; i <5 ; i++){
			System.out.println(this.getName()+" - "+i);
			
			sleep(1000);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		ThreadExtendsTest t1, t2;
		t1 = new ThreadExtendsTest();
		t2 = new ThreadExtendsTest();

		t1.setName("1번 쓰레드");
		t2.setName("2번 쓰레드");

		t1.start();
		t2.start();
		System.out.println("메인 메소드 종료..");
	}

}
