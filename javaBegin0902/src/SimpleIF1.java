
public class SimpleIF1 {

	public static void main(String[] args) {
		int money;
		
		money = 1000;

		if(money >= 10000){			//���� �ݾ��� ���� �̻��̸�
			System.out.println("2000�� ���������� �߱޵Ǿ����ϴ�.");
		}else if(money >= 5000){	//���� �ݾ��� 5000�� �̻��̸�
			System.out.println("1000�� ���������� �߱޵Ǿ����ϴ�.");
		}else{	//���� �ݾ��� 5000�� �̸��̸�
			System.out.println("==���� ���� �߱� �ȳ�==");
			System.out.println("= ���� �̻� ���Ž�     : 2000�� =");
			System.out.println("= ��õ�� �̻� ���Ž� : 1000�� =");
		}
	}

}
