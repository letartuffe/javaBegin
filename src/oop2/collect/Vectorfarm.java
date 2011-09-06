package oop2.collect;

import java.util.Iterator;
import java.util.Vector;

public class Vectorfarm {
	
	static void printMsg(Vector o){
		
		System.out.println("백터 크기는 : "+o.size());
		System.out.println("백터 용량은 : "+o.capacity());
	}

	public static void main(String[] args) {
		
		Vector zoo1 = null; 
		
		String[] ani ;
		
		zoo1 = new Vector(3, 4);
		
		ani = new String[] {"망아지", "송아지", "강아지", "병아리"};
			
		//vec의 크기 및 용량 출력
		System.out.println("백터 초기 크기는 : "+zoo1.size());
		System.out.println("백터 초기 용량은 : "+zoo1.capacity());
		System.out.println("============================");
		
		//애들 넣기
		for(int i = 0; i < ani.length ; i++){
			zoo1.add(ani[i]);
			System.out.print(ani[i]);
		}
		
		System.out.println();
		//vec의 크기 및 용량 출력
		printMsg(zoo1);
		
		//
		Iterator it = zoo1.iterator();
		
		System.out.println("동물들 출력");
		//next가 없을때까지 계속 출력.
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//강아지 내보내기
		zoo1.remove(2);
		System.out.println("이제 남아있는 동물들은?");
		
		//남아있는 동물 출력
		//next가 없을때까지 계속 출력.
		Iterator it2 = zoo1.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		//vec의 크기 및 용량 출력
		printMsg(zoo1);
		System.out.println("============================");
		
		//남은 동물의 숫자만큼 벡터 크기 조절
		zoo1.trimToSize();

		printMsg(zoo1);
	}
}
