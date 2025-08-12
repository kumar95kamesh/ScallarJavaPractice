package day7Concurrency1IntroToThreads;
/**
 * Another way to run multi-threaded.
 */
public class HelloPrinter2 extends Thread{//extends Thread class instead of Runnable interface.
	
	@Override//This is important to override this method otherwise nothing will happen.
	public void run() {
		System.out.println("Hello world "+Thread.currentThread().getName());
	}
}
