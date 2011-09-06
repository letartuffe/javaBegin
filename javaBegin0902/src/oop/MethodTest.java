package oop;

public class MethodTest {
	//원금을 넘겨 받아서
	//이자를 계산하고
	//계산된 이자를 반환하는 interest 메서드
	public int interest(int wongum){
		//원금의 15% 이자 계산
		int eeja = (int)(wongum * 0.15);
		return eeja;
	}
	
//	이자 계산 메서드 v.2
//	이율을 저장하는 인스턴스 멤버 변수 rate 선언	
//	원금과 고객 등급 정보를 매개변수로 받아서 
//	고객 등급이       초우량 고객(a)이면 30%		    	
//	우량 고객(b)이면 20%		    	
//	일반 고객(c)이면 15%			
//	불량 고객(d)이면 5%			
//	그 외의 고객은 0%의 이자를 계산하고
//	계산된 이자는 원단위를 절사하여 반환

	public int interest(int wongum, char level){
		double rate;
		
		//고객 등급에 따라 이율 계산
		switch(level){
		case 'a' : rate = 0.3; break;
		case 'b' : rate = 0.2; break;
		case 'c' : rate = 0.15; break;
		case 'd' : rate = 0.05; break;
		default  : rate = 0.0;
		}
		
		//원금의 15% 이자 계산
		int eeja = (int)(wongum * rate);
		return eeja;
	}
	
}
