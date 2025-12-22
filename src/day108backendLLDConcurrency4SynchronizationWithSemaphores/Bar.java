package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.Semaphore;

public class Bar implements Runnable{
	int n;
	Semaphore fooSemaphore;
	Semaphore barSemaphore;
	
	public Bar(int n,Semaphore fooSemaphore,Semaphore barSemaphore) {
		this.n=n;
		this.fooSemaphore=fooSemaphore;
		this.barSemaphore=barSemaphore;
	}

	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			try {
				this.barSemaphore.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printBar();

			// printBar.run() outputs "bar". Do not change or remove this line.
			this.fooSemaphore.release();
		}
		
	}
	
	public void printBar() {
			System.out.print("bar");
	}

}
