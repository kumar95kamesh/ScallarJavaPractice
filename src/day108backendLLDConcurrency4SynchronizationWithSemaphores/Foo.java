package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.Semaphore;

public class Foo implements Runnable{
	int n;
	Semaphore fooSemaphore;
	Semaphore barSemaphore;
	
	public Foo(int n,Semaphore fooSemaphore,Semaphore barSemaphore) {
		this.n=n;
		this.fooSemaphore=fooSemaphore;
		this.barSemaphore=barSemaphore;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			try {
				this.fooSemaphore.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printFoo();

			// printFoo.run() outputs "foo". Do not change or remove this line.
			this.barSemaphore.release();
		}
		
	}
	
	public void printFoo() {
			System.out.print("foo");
	}

}
