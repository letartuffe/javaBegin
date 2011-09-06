package oop;

public class Animal1 {

	private boolean live ;
	private int age ;
	private String name;
	
	//생성자 생존여부, 나이, 이름을 매개변수로 생성자 작성
	public Animal1(boolean live, int age, String name) {
		this.live = live;
		this.age = age;
		this.name = name;
	}
	
	//이름을 매개변수로 받아서 변수에 넣는 메소드 setter
	public void setName(String name){
		this.name = name ;
	}
	
	//이름을 출력하는 ..
	public void getName(){
		System.out.println(name);
	}
	
	//live가 true인지, false인지에 따라서 살았는지 죽었는지 출력.
	public String getLive(){
		String liveTxt ;
		if (live){
			return liveTxt = "살아잇음";
		}else{
			return liveTxt = "죽었음";			
		}
		
	}
	
	
	
	

}
