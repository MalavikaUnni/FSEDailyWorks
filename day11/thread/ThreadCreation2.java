package com.cts.training.thread;

public class ThreadCreation2 {

	public static void main(String [] args)
	{   
		Resource resource=new Resource();
		
		Thread t=Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY-2);
		FirstThread1 firstThread = new FirstThread1(resource);
		SecondThread2 secondThread=new SecondThread2(resource);
		Thread threadone=new Thread(firstThread);
		Thread threadtwo=new Thread(secondThread);
		threadtwo.setPriority(Thread.MIN_PRIORITY+2);
		threadone.start();
		threadtwo.start();
		System.out.println("First Thread Priority : "+threadone.getPriority());
		System.out.println("Second Thread Priority : "+threadtwo.getPriority());
		
	}
}

class FirstThread1 implements Runnable
{
	Resource resource;
	public FirstThread1(Resource resource)
	{
		this.resource=resource;
	}
	
	public void run() 
	
	{
		resource.display("First Thread");
		
	}
	
}


class SecondThread2 implements Runnable
{
	
	Resource resource;
	public SecondThread2(Resource resource)
	{
		this.resource=resource;
	}
	
	public void run() {
		resource.display("Second Thread");
	}
	
}


class Resource
{
	public void display(String message)
	{
		synchronized (this)
		{
			
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(message+ " " +i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	   }
	}
		
}












