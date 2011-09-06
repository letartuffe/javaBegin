//연습 - 구매금액이 만원이 넘으면
//2000원 할인 쿠폰 
//else if 이용해서 5000원 이상이면 1000원 할인쿠폰
//해당없으면 쿠폰안내 메세지 출력

public class Simple1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money;
		money = 10000;
		
		if (money >= 10000){
			System.out.println("2000원 할인 쿠폰이 발급되었습니다.");
		}else if(money <= 5000){
			System.out.println("1000원 할인 쿠폰이 발급되었습니다.");
			
		}else{
			System.out.println("할인쿠폰 발급 안내");
			System.out.println("만원이상 구매시 2000원쿠폰");
			System.out.println("오천원이상 구매시 1000원쿠폰");
		}
	}

}
