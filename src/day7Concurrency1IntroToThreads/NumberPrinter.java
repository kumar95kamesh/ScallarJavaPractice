package day7Concurrency1IntroToThreads;
/**
 * print 1-1000 numbers in different threads.
 */
public class NumberPrinter implements Runnable{
	int number;
	NumberPrinter(int num){//parametrize so it can assing the number feeded to this.
		this.number=num;
	}
	
	@Override
	public void run() {
		System.out.println(number+ " "+Thread.currentThread().getName());
	}

}
