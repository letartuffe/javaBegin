package oop;

public class HomeWork0822_JST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//20110821�� �Է��ؼ� ����Ϸ� ����.
		//2011�� 08�� 21�� �� ���
		
		String today = "20110821";
		System.out.println(today.subSequence(0, 4)+"�� "+today.subSequence(4, 6)+"�� "+today.substring(6)+"��");
		
		System.out.println("========================");
		
		//�ֹε�Ϲ�ȣ(991122-1234567)�� ������ ������ ��������
		//������ �Ǵ��Ͽ� ������ ���� ��� ���
		//"����� ����"
		
		String jumin = "991122-1234567";
		String sex = "" ;
		jumin.charAt(7);
		switch(jumin.charAt(7)){

			case '1': sex = "����";break;
			case '2': sex = "����";break;
			case '3': sex = "����";break;
	 		case '4': sex = "����";break;
	 		default : sex = "����?";
		}
		System.out.println("����� " + sex);
		
		System.out.println("========================");
	
		//my.image.picture.txt�� Ȯ���ڸ� �����Ͽ� ���
		//�Է����� �� Ȯ���� : txt
		
		String txt1 = "my.image.picture.txt";
		String txt2 ;
		String txt3 ;
		
		//Ȯ���� ���ڼ��� �޶����� ��������..
		txt2 = txt1.substring(txt1.length()-3);
		
		txt3 = txt1.substring(txt1.lastIndexOf(".")+1);
		
		System.out.println("�Է����� �� Ȯ���� : "+txt2);

		System.out.println("========================");
		
		
		//�������� p246 . 1
		
		
		
		//Animal
		Animal1 zoo = new Animal1(true, 3, "ū�Լ�");
		
		//�̸��� ���� ���� ���
		zoo.getName();
		zoo.getLive();
		
		//�̸� ����
		zoo.setName("���");
		
		//�̸��� ���� ���� ���
		zoo.getName();
		zoo.getLive();
		
		
		System.out.println("========================");
		
		//�������� p126.2
		//charAt() ù���ڸ� ��ȯ�ϴ� �޼ҵ�
		//isDigit(ch)  �������� �Ǻ��ϴ� �޼���
		//isUpperCase(ch) �빮������ �Ǻ��ϴ� �޼���
		//isLowerCase(ch) �ҹ������� �Ǻ��ϴ� �޼���
		
		
		//��Ŭ������ Run - Run Configulations -arguement ���ؼ� �޴� �Ű�����
		//args[0];
		
		System.out.println(args[0].charAt(0));
		
		Character box = new Character(args[0].charAt(0));
		String spell = box.toString();
		
		System.out.println(spell);
		
		
		  if (spell.isDigit(box)) {
		      System.out.println("����");
		  } else if (spell.isUpperCase(box) == true) {
		      System.out.println("�빮��");
		  } else if (spell.isLowerCase(box) == true) {
		      System.out.println("�ҹ���");
		  } else {
		      System.out.println("Ư�� ����");
		  }
		
		
			
		
		
		
		
		
	}
	
	

}
