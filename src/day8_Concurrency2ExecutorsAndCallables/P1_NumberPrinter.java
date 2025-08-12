package day8_Concurrency2ExecutorsAndCallables;
/**
 * print 1-1000 numbers in different threads.
 */
public class P1_NumberPrinter implements Runnable{
	int number;
	P1_NumberPrinter(int num){//parametrize so it can assing the number feeded to this.
		this.number=num;
	}
	
	@Override
	public void run() {
		System.out.println(number+ " "+Thread.currentThread().getName());
	}

}
