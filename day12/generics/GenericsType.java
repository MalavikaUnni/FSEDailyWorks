package com.cts.generics;

public class GenericsType<T> {
private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		GenericsType<String> type = new GenericsType<>();
		type.set("Pankaj"); //valid
		String n = type.get();
		System.out.println(n);
		GenericsType type1 = new GenericsType(); //raw type
		type1.set("Pankaj"); //valid
		type1.set(10); //valid and autoboxing support
		//String m= type1.get();
		System.out.println(type1.get());
		GenericsType<Integer> type2 = new GenericsType<>();
		type2.set(6);
		System.out.println(type2.get());
	}

}
