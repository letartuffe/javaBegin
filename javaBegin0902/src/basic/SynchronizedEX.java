package basic;

class TongJang{
	public int i=0;
}

class InputMoney extends Thread{
	public void run(){
		for(int i=0 ; i<10 ; i++){
			synchronized (SynchronizedEX.tong){
				SynchronizedEX.tong.i++;
				System.out.println(
					getName() + " : " +
					SynchronizedEX.tong.i
				);
			}
		}
	}
}

public class SynchronizedEX {
	public static TongJang tong = new TongJang();
	public static void main(String[] args) {
		InputMoney t;			InputMoney j;
		t = new InputMoney();	j = new InputMoney();
		t.setName("Tom");		j.setName("Jane");
		t.start();				j.start();		
	}
}
