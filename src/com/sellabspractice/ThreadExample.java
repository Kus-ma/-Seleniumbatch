package com.sellabspractice;

public class ThreadExample extends Thread 
{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("selenium");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
		
	}		
		
	
	
	public static void main(String[] args) //main thread
	{
		ThreadExample te = new ThreadExample(); 
		te.start(); // additional thread which added 
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Testing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	}


