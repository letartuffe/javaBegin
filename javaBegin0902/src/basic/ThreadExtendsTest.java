package basic;

public class ThreadExtendsTest 
			extends Thread{
		
	@Override
	public void run() {
		//스레드의 이름과 출력 횟수를 5번 표시
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
		
		t1.setName("첫째 스레드");
		t2.setName("둘째 스레드");
		
		t1.start();
		t2.start();
		
		System.out.println("--- 메인 메서드 종료 ---");
	}
}







