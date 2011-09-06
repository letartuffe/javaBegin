package oop2.collect;

public class GenericEX<T> {
	T[] v;
	
	public void set(T[] n){
		v = n;
	}
	
	public void print(){
		for(T temp : v){
			System.out.println(temp);
		}
	}
}
