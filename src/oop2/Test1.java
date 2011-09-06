package oop2;

//참고할 소스
public class CharAT {


	 public static void main(String[] args) {
	  // TODO Auto-generated method stub

	  if (args.length < 1) {
	      System.out.println("입력된 파라메터 없음");
	  } else {
	      System.out.println("입력된 값은 " + args[0] + " 은(는) 입니다.");
	  }

	  char ch = args[0].charAt(0);  // 꼭 이렇게 써야 하는 것인가??

	  if (Character.isDigit(ch)) {
	      System.out.println("숫자");
	  } else if (Character.isUpperCase(ch) == true) {
	      System.out.println("대문자");
	  } else if (Character.isLowerCase(ch) == true) {
	      System.out.println("소문자");
	  } else {
	      System.out.println("특수 문자");
	  }
	 }
	} 