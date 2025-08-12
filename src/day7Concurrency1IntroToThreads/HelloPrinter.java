package day7Concurrency1IntroToThreads;

/**
 * Print hello world using multi-thread
 */
public class HelloPrinter implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Hello world");
		
		// To check in which thread this method is running
		System.out.println(Thread.currentThread().getName()+" ==run method thread==");
		
		//Thread.sleep(1000); y command thread ko sleep m leke jati h.. baki threads ko run krna h to wo run ho jayegi
		//threads execution ka order fix bhi nhi hoga.. jo mil jayega use hi processor run kr dega.
		
		/**
		 * So where we are putting this Thread.sleep(); will decide whether main thread is sleeping or the created one
		 * is sleeping.. 
		 * e.g. agar yha run method m lgaya to y perticular thread sleep m jayegi
		 * but again main class m thread.sleep lgaya to main thread hi sleep m jayegi..
		 */
		
	}

}
