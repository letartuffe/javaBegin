package basic;

class Tongjang{
	public int i = 0 ;
	
}

class InputMoney extends Thread {

	@Override
	public void run() {
		
		for (int i=0 ; i<10 ; i++){
			synchronized (SynchronizedEx.tong){
				SynchronizedEx.tong.i++ ;
				System.out.println(getName()+" : "+SynchronizedEx.tong.i);
			}
			
		}
		
	}
	
}

public class SynchronizedEx{
	
	//변수 i를 공유하기 위해 static 객체로 생성.
	public static Tongjang tong = new Tongjang();
	
	public static void main(String[] args) {
		
		InputMoney t , j;
		t = new InputMoney();
		j = new InputMoney();

		t.setName("Tom");
		j.setName("Jane");
		
		t.start();
		j.start();
		
	}

}
