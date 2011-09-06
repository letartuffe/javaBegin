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
		//내부클래스의 이름과 참조변수가 없는 내부 클래스 유형을 사용하기
		
		new AnnoyInner().test();
	}

}
