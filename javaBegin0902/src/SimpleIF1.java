
public class SimpleIF1 {

	public static void main(String[] args) {
		int money;
		
		money = 1000;

		if(money >= 10000){			//구매 금액이 만원 이상이면
			System.out.println("2000원 할인쿠폰이 발급되었습니다.");
		}else if(money >= 5000){	//구매 금액이 5000원 이상이면
			System.out.println("1000원 할인쿠폰이 발급되었습니다.");
		}else{	//구매 금액이 5000원 미만이면
			System.out.println("==할인 쿠폰 발급 안내==");
			System.out.println("= 만원 이상 구매시     : 2000원 =");
			System.out.println("= 오천원 이상 구매시 : 1000원 =");
		}
	}

}
