package oop;

public class Animal1 {

	private boolean live ;
	private int age ;
	private String name;
	
	//������ ��������, ����, �̸��� �Ű������� ������ �ۼ�
	public Animal1(boolean live, int age, String name) {
		this.live = live;
		this.age = age;
		this.name = name;
	}
	
	//�̸��� �Ű������� �޾Ƽ� ������ �ִ� �޼ҵ� setter
	public void setName(String name){
		this.name = name ;
	}
	
	//�̸��� ����ϴ� ..
	public void getName(){
		System.out.println(name);
	}
	
	//live�� true����, false������ ���� ��Ҵ��� �׾����� ���.
	public String getLive(){
		String liveTxt ;
		if (live){
			return liveTxt = "�������";
		}else{
			return liveTxt = "�׾���";			
		}
		
	}
	
	
	
	

}
