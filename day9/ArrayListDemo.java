package com.cts.day9;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
	public static void main(String [] args)
	{
		
		
		/* ArrayList list=new ArrayList();
		list.add("hello");
		list.add(2020);
		list.add("january");
		list.add(true);
		list.add(1,"1st");
		list.remove(true);
		System.out.println(list.size());
		System.out.println(list); */
		
		//ArrayList<Integer> names=new ArrayList<>();
		//names.add("sai");
		//names.add("syed");
		//names.add("divya");
		//names.add(1);
		//names.add(30);
		//names.add(80);
		
		
		//list.addAll(names);
		//System.out.println(list);
		//System.out.println(list.contains("test"));
		
		 // 1 method 
		/*Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		} */
		
		// 2nd method
		/*for(Object obj :list)
		{
			System.out.println(obj);
		} */
		
		/*ListIterator<Integer> lit= list.listIterator();
		System.out.println("----------------Forward Direction");
		while(lit.hasNext())
		{   int a=lit.next();
			System.out.println(a);
			if(a==12)
			{
				break;
			}
		}
		System.out.println("---------------Backward Direction");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}*/ 
		
		
		LinkedList list=new LinkedList();
		list.add("hello");
		list.add(2020);
		list.add("january");
		list.add(true);
		list.add(1,"1st");
		list.remove(true);
		list.addFirst(1111);
		list.addLast(9999);
		System.out.println(list.size());
		System.out.println(list);
		
		
		
		
	}

}
