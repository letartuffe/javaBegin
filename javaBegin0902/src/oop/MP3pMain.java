package oop;

public class MP3pMain {

	public static void main(String[] args) {
		MP3p mp3;			//MP3p Ŭ������ ���� ��ü ����
			
		mp3 = new MP3p();	//���� ��ü ����
		
		// ����� ������ ���ÿ� 
		// ==> MP3p mp3 = new MP3p();
		
		//�޸� �뷮�� �ø��� �޼��� ȣ��
		mp3.memoryUp(1000);
		
		//mp3�� ���� �����, �뷮�� 4000, �Ｚ ����
		
		//�ν��Ͻ� ����
//		mp3.color = "���";
		
		//MP3 ���� �ٲٴ� �޼��� ȣ��
		mp3.setColor("���");
		
		mp3.memory = 4000;
		
		//����ƽ(Ŭ����) ����
		MP3p.maker = "�Ｚ";
		
	}

}













