package oop;

public class MP3p {
//	Ŭ������ : MP3p
//	�Ӽ� : ������ ����ϴ� color         
//	             �޸� �뷮�� ����ϴ� memory
//	���� : memory�뷮�� upgrade���ִ� memoryUp         
//	      color�� �����ϴ� setColor
	
	private String color;
	int memory;
	static String maker;
	
//	���� : memory�뷮�� upgrade���ִ� memoryUp   
	public void memoryUp(int n){
		memory += n;
		System.out.println("�޸� �뷮 ���׷��̵� �Ϸ�!");
	}
	
//	color�� �����ϴ� setColor
	public void  setColor(String c){
		color = c;
		System.out.println("���� ���� �Ϸ�!");
	}


}
