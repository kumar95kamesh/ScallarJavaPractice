package day7Concurrency1IntroToThreads;

public class MainHelloPrinter {

	public static void main(String[] args) {
		HelloPrinter h=new HelloPrinter();
		// OR
//		Runnable h=new HelloPrinter();
		Thread t=new Thread(h);//thread class will need input.. just go and check out this class
		t.start();//This method will start thread.
		/**
		 * Generally in java program runs in main thread.. but in this way we are telling java to execute 
		 * in this thread.
		 */
		
		//To check thread in which running
		System.out.println(Thread.currentThread().getName()+" ==normal thread==");
		
		/**
		 * line number 10 runs first then 17 but getting o/p of 17 first.. this is happening bcoz main thread is 
		 * alread there.. so this thread runs fast.. for other one it creates thread then execute 10 line..
		 * this is showing both are running in different threads.
		 */
		
		
		
		//creating another thread
		Runnable h2=new HelloPrinter();
		Thread t2=new Thread(h2);
		t2.start();
		
		/**
		 * instead of start(); if we call run(); then run() will run in main thread.. because its like normal method calling
		 * but start() will run thread wise.
		 * Thread.run(); or HelloPrinter.run(); both same.
		 */
	}

}
