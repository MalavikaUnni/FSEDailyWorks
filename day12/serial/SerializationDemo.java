package com.cts.serial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cts.stream.Employee;

public class SerializationDemo {
	
	public static Object deserialize(String fileName) throws ClassNotFoundException, IOException
	{
		FileInputStream fin =new FileInputStream(fileName);
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream oin=new ObjectInputStream(bin);
		Object obj=oin.readObject();
		return obj;
	}
	
    public static void serialize(Object obj, String fileName) throws IOException
    {
    	FileOutputStream fout=new FileOutputStream(fileName);
    	BufferedOutputStream bout=new BufferedOutputStream(fout);
    	ObjectOutputStream out = new ObjectOutputStream(bout);
    	out.writeObject(obj);
    	out.close();
    	bout.close();
    	fout.close();
    }
	
    public static void main(String[] args) 
    {
		Employee employee=new Employee(111,"Sai","Kohlapur",22,433434,4564654);
		try {
			serialize(employee,"serial.txt");
			
			Employee emp=(Employee) deserialize("serial.txt");
		
		}
		 catch (ClassNotFoundException e)
		{
			
			e.printStackTrace();
		}
		
        catch (IOException e)
		{
			
			e.printStackTrace();
		}
		

	}

}
