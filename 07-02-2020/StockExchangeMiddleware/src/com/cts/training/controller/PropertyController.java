package com.cts.training.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertyController {
	
	public static void main(String[] args) throws IOException  {
		
		//Properties properties=new Properties();
		Properties p=System.getProperties();
		FileInputStream fin=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\StockExchangeMiddleware\\src\\com\\cts\\training\\controller\\details.properties");
		 Properties props = new Properties();
//		    props.setProperty("1", "One");
//		    props.setProperty("2", "Two");
//		    props.setProperty("3", "Three");
//		    props.setProperty("4", "Four");
//		    props.setProperty("5", "Five");
//		    
//		    Set<String> keys = props.stringPropertyNames();
//		    for (String key : keys) {
//		      System.out.println(key + " : " + props.getProperty(key));
//		    }
		 
//		 Set<Map.Entry<Object,Object>> set=p.entrySet();
//		 for(Map.Entry<Object, Object> entry :set)
//		 {
//			 System.out.println(entry.getKey() + "->" + entry.getValue());
//		 }
		 
		 
		 Set set=p.entrySet()
				 for(Object e : set)
				 {
					 System.out.println(e);
				 }
		    
		//System.out.println(p);
//		properties.load(fin);
//		System.out.println("username:" +properties.getProperty("username"));
//		System.out.println("password:" +properties.getProperty("password"));
		
		
		
	}

}
