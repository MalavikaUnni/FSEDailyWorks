package com.cts.day9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo 
{
	public static void main(String [] args)
	{ 
		
		
		// HASHSET AND LINKEDHASHSET
		//LinkedHashSet<String> set =new LinkedHashSet<String>();
		//HashSet<String> set =new HashSet<String>();
		TreeSet<String> set =new TreeSet<String>();
		set.add("Banglore");
		set.add("Mumbai");
	    set.add("Delhi");
	    set.add("Kerala");
	    for(String s: set)
	    {
	    	System.out.println(s);
	    }
	}
	 

}
