package com.cts.day6;
import java.lang.*;
public class exerciseString2 {
	public static void main(String [] args)
	{
		String str="Global Warming";
		int len=str.length();
		System.out.println(str.substring(len-4));             //a
		System.out.println(str.substring(4,8));              //b
		System. out. println(str. matches("[a-zA-Z0-9]+")); //c
        System.out.println(str.substring(0,len-4));         //d
        System.out.println(str.substring(4,len));          //e
        System.out.println(str.indexOf("Wa"));             //f
        //System.out.println(str.isUpperCase())
        StringBuffer str1 = new StringBuffer(str);
        for (int i=0; i<len; i++) 
        { 
            Character c = str1.charAt(i); 
            if (Character.isLowerCase(c)) 
                str1.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                str1.replace(i, i+1, Character.toLowerCase(c)+""); 
             
        } 
        System.out.println(str1);                         //soln g
        
        StringBuilder converted = new StringBuilder(str);
        Character ch = converted.charAt(0);
        if (Character.isUpperCase(ch)) 
        {
        System.out.println("tile case");
        }
        else
        {
        	System.out.println("not in title case"); //soln h
        }
        char[] choice=new char[len];
    	for(int i=0;i<len;i++)
    	{
    	choice[i]=str.charAt(i); 
    	if(choice[i]=='a')
    	{
    		choice[i]='*';		
    								//solution i
    	}
    	System.out.print(choice[i]);
    	}
        
        
        
        }
    }

        
        
 

