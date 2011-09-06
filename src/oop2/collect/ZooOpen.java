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
		cage.add("���");
		cage.add("�ϱذ�");
		cage.add("�⸰");
		cage.add("ȣ����");
		cage.add("����");
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
		
		
		System.out.println("== �����鿡 ������ ������ ���! ==");
		
		Iterator<String> it = cage.iterator();
		//next�� ���������� ��� ���.
		while(it.hasNext()){
			System.out.println(it.next());
		}
				
	}
	
	public void seeCage(int num){
		if (num == 1){
			System.out.println("==1�� �츮�� �ִ� �������Դϴ�.==");
			
			Iterator<String> it = cageOne.iterator();
			//next�� ���������� ��� ���.
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}else if(num == 2){
			System.out.println("==2�� �츮�� �ִ� �������Դϴ�.==");

			Iterator<String> it = cageTwo.iterator();
			//next�� ���������� ��� ���.
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
		
		System.out.println("==�������� �ű�ϴ�.==");
		z.moveAnimal("ȣ����", 1);
		z.moveAnimal("�ϱذ�", 2);
		z.moveAnimal("�⸰", 1);
		z.moveAnimal("���", 2);

		z.seeCage(1);
		z.seeCage(2);
		
		System.out.println("�Ҿ���� ������ ����� ã�Ƽ�...");
		z.seeAll();
	}

}
