package com.cts.day10;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String [] args)
	{
		//Map<String, Integer> map=new HashMap<String,Integer>();
		//Map<String, Integer> map=new HashMap<String,Integer>();
		//LinkedHashMap<String, Integer> map=new LinkedHashMap<String,Integer>();
		//Hashtable<String, Integer> map=new Hashtable<String,Integer>();
		TreeMap<String, Integer> map=new TreeMap<String,Integer>();
		map.put("Java",8000);
		map.put("Android", 10000);
		map.put("Angular",4000);
		//map.put(null, 9000);
		/*System.out.println(map);
		System.out.println(map.get("Java"));
		System.out.println(map.containsKey("Android"));
		System.out.println(map.containsValue(4000));
		map.replace("Angular", 4000, 5000);  */  // map.put("Angular",5000) its complicated
	
		//method 1 to retrieve <key,value> pairs
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String, Integer> entry : entries)
		{
			System.out.println(entry.getKey()+"===>" +entry.getValue());
		}
           
		
		//Method 2

		/*for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" -->" +entry.getValue());
		}*/
		
	}

}
