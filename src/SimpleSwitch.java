//������ 90�̸� A
//80 - B
//70 - c
//     f

// �߰���
//switch / case�� �̿�
//grade�� ���� �޼��� ���

public class SimpleSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 80 ;
		char grade = ' ';
		switch(score){
			case 90 : grade = 'A'; break; //excellent
			case 80 : grade = 'B'; break; //good
			case 70 : grade = 'C'; break; //nomal
			default : grade = 'F'; 		   //chear up!!
		}
		System.out.println("���� :" +  grade);
		
		//switch / case�� �̿�
		//grade�� ���� �޼��� ���
		switch(grade){
			case 'A' : System.out.println("grade is "+grade+". excellent!!!");	break;	//excellent
			case 'B' : System.out.println("grade is "+grade+". good!");			break;	//good
			case 'C' : System.out.println("grade is "+grade+". nomal");			break;	//nomal
			default :  System.out.println("grade is "+grade+". chear up!!");			//chear up!!
		}
		
	}
		

}
