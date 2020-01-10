package com.cts.day9;

import java.util.PriorityQueue;

public class PriorityDemo {
	public static void main(String [] args)
	{
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		pQueue.add("C"); 
        pQueue.add("C++"); 
        pQueue.add("Java"); 
        pQueue.add("Python"); 
  
        System.out.println("Head value using peek function:"
                + pQueue.peek()); 
        
        System.out.println("Removing top value using poll function:"
                + pQueue.poll()); 
        System.out.println(pQueue.peek());
        System.out.println(pQueue.element());
        System.out.println(pQueue.remove("C++"));
        System.out.println(pQueue.peek());
		
	}

}
