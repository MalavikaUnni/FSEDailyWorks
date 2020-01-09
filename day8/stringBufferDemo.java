package com.cts.day6;

public class stringBufferDemo 
{
	public static void main(String [] args)
	{
		StringBuffer sb= new StringBuffer("helloo");
		System.out.println(sb.capacity());
		StringBuffer sb1= new StringBuffer(50);
		System.out.println(sb1.capacity());
		System.out.println(sb.append("hii"));
		System.out.println(sb.insert(3, "ow"));
		StringBuffer sb2= new StringBuffer("welcome to java training");
		System.out.println(sb2.replace(11, 15, "Fullstack"));
		//System.out.println(sb.ensureCapacity(16));
		
		
	}
	
		
		
		/* sb.append("thoripakkam");
		System.out.println(sb.capacity());
		sb.append(" chennai");
		System.out.println(sb.capacity());
	} */

}
