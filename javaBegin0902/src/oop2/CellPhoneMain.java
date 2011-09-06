package oop2;

public class CellPhoneMain {

	public static void main(String[] args) {
		//��ǰ��ȣ�� aaa-100,
		//��ȭ��ȣ�� 010-1111-2222,
		//60ȭ��, 400�� �ػ󵵸� ������
		//DicaPhone ��ü ����
		DicaPhone d = new DicaPhone("aaa-100", 
									"010-1111-2222", 
								    60, "400");		
		
		//��ǰ��ȣ�� bbb-200,
		//��ȭ��ȣ�� 010-3333-4444,
		//30ȭ��, �޸𸮿뷮�� 512¥��
		//MP3Phone ��ü ����
		MP3Phone p = new MP3Phone("bbb-200", 
								  "010-3333-4444",
								  30, 512);		
		
		//�� Ŭ������ getter�� �̿��Ͽ� 
		//DicaPhone ��ü�� ��, ȭ��, ��ȭ��ȣ�� ���
		System.out.println("DicaPhone info : " 
							+ d.getModel() + " "
							+ d.getChord() + " "
							+ d.getNumber());
		//MP3Phone ��ü�� ��, ȭ��, ��ȭ��ȣ�� ���
		System.out.println("MP3Phone info : " 
							+ p.getModel() + " "
							+ p.getChord() + " "
							+ p.getNumber());
		
	}

}
