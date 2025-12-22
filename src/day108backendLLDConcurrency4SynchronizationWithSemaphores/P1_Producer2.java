package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.Semaphore;

public class P1_Producer2 implements Runnable {
	P1_Store2 store;
	Semaphore prodSemaphore;
	Semaphore consSemaphore;
	
	public P1_Producer2(P1_Store2 st,Semaphore prodSemaphore,Semaphore consSemaphore) {
		this.store=st;
		this.consSemaphore=consSemaphore;
		this.prodSemaphore=prodSemaphore;
	}
	
	/**
	 * Synchronized not required because those many permits we have... we can allow
	 * that many threads to work on it.... synchronized all the things Semaphore will
	 * take care.
	 */

	@Override
	public void run() {
		while (true) {
				try {
					prodSemaphore.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				store.addItems();
				consSemaphore.release();
		}
	}
}
