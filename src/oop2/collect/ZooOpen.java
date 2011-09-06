package oop2.collect;

import java.util.*;

abstract class Park{
	
	Vector<String> cage ;
	
	abstract void getAnimal();
}



class Zoo extends Park{
	
	ArrayList<String> cageOne = new ArrayList<String>();
	ArrayList<String> cageTwo = new ArrayList<String>();

	@Override
	public void getAnimal() {		
		cage = new Vector<String>();
		cage.add("펭귄");
		cage.add("북극곰");
		cage.add("기린");
		cage.add("호랭이");
		cage.add("사자");
	}
	
	public void moveAnimal(String name, int num){

		
		if (num == 1){
			cageOne.add(name);
			cage.remove(name);
			System.out.println("          .");
			
		}else if(num == 2){
			cageTwo.add(name);
			cage.remove(name);
			System.out.println("          .");
		}
			
	}
	
	public void seeAll(){
		
		
		System.out.println("== 동물들에 도착한 동물들 목록! ==");
		
		Iterator<String> it = cage.iterator();
		//next가 없을때까지 계속 출력.
		while(it.hasNext()){
			System.out.println(it.next());
		}
				
	}
	
	public void seeCage(int num){
		if (num == 1){
			System.out.println("==1번 우리에 있는 동물들입니다.==");
			
			Iterator<String> it = cageOne.iterator();
			//next가 없을때까지 계속 출력.
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}else if(num == 2){
			System.out.println("==2번 우리에 있는 동물들입니다.==");

			Iterator<String> it = cageTwo.iterator();
			//next가 없을때까지 계속 출력.
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
	}
	
	
}

public class ZooOpen {

	public static void main(String[] args) {
		
		Zoo z = new Zoo();
		
		z.getAnimal();
		z.seeAll();
		
		System.out.println("==동물들을 옮깁니다.==");
		z.moveAnimal("호랭이", 1);
		z.moveAnimal("북극곰", 2);
		z.moveAnimal("기린", 1);
		z.moveAnimal("펭귄", 2);

		z.seeCage(1);
		z.seeCage(2);
		
		System.out.println("잃어버린 사자의 행방을 찾아서...");
		z.seeAll();
	}

}
