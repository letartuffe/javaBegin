package oop;

public class MethodTest {


	//�޽�� --- interest
	//����� �Ű������� �޾Ƽ� ���ڰ���ϰ� 
	//���� ���ڸ� ��ȯ�ϴ� �޼��� 
	
	//��� ---  int won
	//������ ���� -- double interest_rate
	 
	public static int interest(int won, char grade){

		double interestGrade ;
		
		switch(grade)
		{
			case 'a': interestGrade = 0.3 ; break;
			case 'b': interestGrade = 0.2 ; break;
			case 'c': interestGrade = 0.15 ; break;
			case 'd': interestGrade = 0.05 ; break;
			default :
				interestGrade = 0;
		}
		
		//���� ��ݿ� 15% ���ؼ� ���� ���
		return (int) (won * interestGrade);
		
	}
}
