package oop2.collect;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		//Vector의 인스턴스(객체) vec 생성
		
		Vector<Integer> vec = new Vector<Integer>();
		
		//vec의 크기 및 용량 출력
		System.out.println(vec.size()+" "+vec.capacity());
		
		
		//Vector의 인스턴스 v 생성
		//초기 용량은 5, 용량 증가는 2씩 되도록..
		Vector<Integer> v = new Vector<Integer>(5, 2);
		
		for (int i = 0; i<6;i++){
			v.add(i*10);
			System.out.print(v.get(i)+" ");
		}
		
		System.out.println(v.size()+" "+v.capacity());
		
		System.out.println(v.firstElement()+" "+v.get(1));
		
		System.out.println(v);
		
		//v.removeElementAt(3);
		v.remove(3);
		System.out.println(v);
		
		
		
				
		
		
		

	}

}
