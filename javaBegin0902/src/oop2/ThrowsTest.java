package oop2;

public class ThrowsTest {

	public static void main(String[] args) {
		
		//try catch�� �̿��Ͽ� ���� ó�� --> ���� ����
		try{
			exp(0);
		}catch(NullPointerException ne){
			ne.printStackTrace();
		}
	}

	private static void exp(int i)
						throws NullPointerException{
		if(i == 0){
			//���Ƿ� ���ܸ� �߻���Ŵ
			throw new NullPointerException();
		}
	}

}
