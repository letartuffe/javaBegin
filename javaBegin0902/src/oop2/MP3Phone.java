package oop2;

public class MP3Phone extends CellPhone {
	// ���� �뷮�� ������ ���� size ����
	int size;

	// �𵨸�, ��ȭ��ȣ, ȭ��, ����뷮��
	// �Ű������� �޾Ƽ� �ʱ�ȭ�ϴ� ������ �ۼ�
	public MP3Phone(String model, 
					String number, 
					int chord, 
					int size) {
		this.model = model;
		this.number = number;
		this.chord = chord;
		this.size = size;
	}
}
