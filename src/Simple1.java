//���� - ���űݾ��� ������ ������
//2000�� ���� ���� 
//else if �̿��ؼ� 5000�� �̻��̸� 1000�� ��������
//�ش������ �����ȳ� �޼��� ���

public class Simple1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money;
		money = 10000;
		
		if (money >= 10000){
			System.out.println("2000�� ���� ������ �߱޵Ǿ����ϴ�.");
		}else if(money <= 5000){
			System.out.println("1000�� ���� ������ �߱޵Ǿ����ϴ�.");
			
		}else{
			System.out.println("�������� �߱� �ȳ�");
			System.out.println("�����̻� ���Ž� 2000������");
			System.out.println("��õ���̻� ���Ž� 1000������");
		}
	}

}
