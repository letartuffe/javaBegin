//int�� ���� visitCount�� �����ϰ� 0���� �ʱ�ȭ
//if���� �̿��Ͽ�, ù�湮�̸� ȯ���޼��� ���
//visitCount�� 1���� ũ�� ��湮 �޼��� ���
//�޼��� ����� visitCount 1����
//else if �̿��Ͽ� ����° �湮 �޼��� ���

public class CountIF1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int visitCount = 9999;
		if (visitCount < 1){
			System.out.println("ó�����̾�� ȯ���մϴ�.");
		}else if(visitCount == 9999){
			System.out.println("�����մϴ�. ����° �湮�Դϴ�. �����մϴ�.");
		}else{
			System.out.println("�ٽÿ��̱��� �����մϴ�.");
		}
		System.out.printf("%d�� ���̾��.\n", ++visitCount);
	}
}
