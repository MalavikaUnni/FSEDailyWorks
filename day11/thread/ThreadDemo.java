package com.cts.training.thread;

public class ThreadDemo {

	public static void main(String [] args)
	{
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		
		System.out.println("Thread Name : " +thread.getName());
		thread.setName("CTS Thread");
		System.out.println("Thread Name" + thread.getName());
		System.out.println("Is thread Daemon" +thread.isDaemon());
		System.out.println("Is Thread Alive? "+thread.isAlive());
		System.out.println("Thread State :" +thread.getState());
		System.out.println("Thread id " +thread.getId());
	}
	
}
