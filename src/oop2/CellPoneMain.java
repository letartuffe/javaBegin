package oop2;

public class CellPoneMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ǰ��ȣ��. aaa-100
		//��ȭ��ȣ 111-111-1111
		//60ȭ��, 400���ػ� ������
		//DicaPhone ��ü ����
		//
		//��ǰ��ȣ bbb-200
		//��ȭ��ȣ 010-333-4444
		//30ȭ��, �޸𸮿뷮 512
		//MP3Phone ��ü ����

		DicaPhone dica = new DicaPhone("aaa-100", "111-111-1111", 60, "400��");
		Mp3Phone mp3Phone = new Mp3Phone("bbb-100", "010-333-4444", 30, 512);
		
		//�� ȭ�� ��ȭ��ȣ ���
		System.out.println(dica.model+", "+dica.chord+", "+dica.number);
		System.out.println(mp3Phone.model+", "+mp3Phone.chord+", "+mp3Phone.number);
		
		//�� Ŭ������ getter�� �̿��Ͽ� 
		//�� ȭ�� ��ȭ��ȣ ���
		//CellPhone���� �ۼ��� get.. �޼ҵ�� �̿�.

		System.out.println("DicaPhone ���� : " + dica.getModel()+"  "  + dica.getChord()+"  "  + dica.getChord());
		System.out.println("DicaPhone ���� : " + mp3Phone.getModel()+"  " + mp3Phone.getChord()+"  "  + mp3Phone.getChord());

	}

}
