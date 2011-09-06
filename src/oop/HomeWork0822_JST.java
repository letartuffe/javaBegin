package oop;

public class HomeWork0822_JST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//20110821을 입력해서 년월일로 구분.
		//2011년 08월 21일 로 출력
		
		String today = "20110821";
		System.out.println(today.subSequence(0, 4)+"년 "+today.subSequence(4, 6)+"월 "+today.substring(6)+"일");
		
		System.out.println("========================");
		
		//주민등록번호(991122-1234567)를 임의의 변수에 저장한후
		//성별을 판단하여 다음과 같이 결과 출력
		//"당신은 남자"
		
		String jumin = "991122-1234567";
		String sex = "" ;
		jumin.charAt(7);
		switch(jumin.charAt(7)){

			case '1': sex = "남자";break;
			case '2': sex = "여자";break;
			case '3': sex = "남자";break;
	 		case '4': sex = "여자";break;
	 		default : sex = "뭐지?";
		}
		System.out.println("당신은 " + sex);
		
		System.out.println("========================");
	
		//my.image.picture.txt의 확장자를 추출하여 출력
		//입력파일 의 확장자 : txt
		
		String txt1 = "my.image.picture.txt";
		String txt2 ;
		String txt3 ;
		
		//확장자 글자수가 달라지면 문제가됨..
		txt2 = txt1.substring(txt1.length()-3);
		
		txt3 = txt1.substring(txt1.lastIndexOf(".")+1);
		
		System.out.println("입력파일 의 확장자 : "+txt2);

		System.out.println("========================");
		
		
		//연습문제 p246 . 1
		
		
		
		//Animal
		Animal1 zoo = new Animal1(true, 3, "큰뿔소");
		
		//이름과 생존 여부 출력
		zoo.getName();
		zoo.getLive();
		
		//이름 변경
		zoo.setName("펭귄");
		
		//이름과 생존 여부 출력
		zoo.getName();
		zoo.getLive();
		
		
		System.out.println("========================");
		
		//연습문제 p126.2
		//charAt() 첫글자를 반환하는 메소드
		//isDigit(ch)  숫자인지 판별하는 메서드
		//isUpperCase(ch) 대문자인지 판별하는 메서드
		//isLowerCase(ch) 소문자인지 판별하는 메서드
		
		
		//이클립스의 Run - Run Configulations -arguement 통해서 받는 매개변수
		//args[0];
		
		System.out.println(args[0].charAt(0));
		
		Character box = new Character(args[0].charAt(0));
		String spell = box.toString();
		
		System.out.println(spell);
		
		
		  if (spell.isDigit(box)) {
		      System.out.println("숫자");
		  } else if (spell.isUpperCase(box) == true) {
		      System.out.println("대문자");
		  } else if (spell.isLowerCase(box) == true) {
		      System.out.println("소문자");
		  } else {
		      System.out.println("특수 문자");
		  }
		
		
			
		
		
		
		
		
	}
	
	

}
