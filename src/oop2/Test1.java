package oop2;

//������ �ҽ�
public class CharAT {


	 public static void main(String[] args) {
	  // TODO Auto-generated method stub

	  if (args.length < 1) {
	      System.out.println("�Էµ� �Ķ���� ����");
	  } else {
	      System.out.println("�Էµ� ���� " + args[0] + " ��(��) �Դϴ�.");
	  }

	  char ch = args[0].charAt(0);  // �� �̷��� ��� �ϴ� ���ΰ�??

	  if (Character.isDigit(ch)) {
	      System.out.println("����");
	  } else if (Character.isUpperCase(ch) == true) {
	      System.out.println("�빮��");
	  } else if (Character.isLowerCase(ch) == true) {
	      System.out.println("�ҹ���");
	  } else {
	      System.out.println("Ư�� ����");
	  }
	 }
	} 