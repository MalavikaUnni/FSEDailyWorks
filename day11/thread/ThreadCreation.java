package com.cts.training.thread;

public class ThreadCreation {

	public static void main(String[] args) {
		System.out.println("Main Thread"); //By Main Thread--Only 1 Thread
		
		FirstThread firstThread = new FirstThread();
		SecondThread secondThread=new SecondThread();
		firstThread.start(); //It will can run()
		
		secondThread.start();
		//We have two threads 1.Main 2.FirstThread
		//By main Thread
		/*for(int i=0;i<=5;i++)
		{
			System.out.println("Main Thread :"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}*/

	}

}

//Odd Values
class FirstThread extends Thread
{

	@Override
	public void run() {
		for(int i=1;i<=10 ;i++)
		{
			if(i%2!=0) {
			System.out.println("First Thread : "+i);
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}

//Even values
class SecondThread extends Thread
{

	@Override
	public void run() {
		for(int i=1;i<=10 ;i++)
		{
			if(i%2==0)
			{
			System.out.println("Second Thread : "+i);
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}


