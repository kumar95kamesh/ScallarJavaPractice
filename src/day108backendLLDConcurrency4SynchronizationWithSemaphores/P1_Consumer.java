package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.Semaphore;

public class P1_Consumer implements Runnable {
	P1_Store store;
	Semaphore prodSemaphore;
	Semaphore consSemaphore;

	public P1_Consumer(P1_Store st, Semaphore prodSemaphore, Semaphore consSemaphore) {
		this.store = st;
		this.consSemaphore = consSemaphore;
		this.prodSemaphore = prodSemaphore;
	}

	@Override
	public void run() {
		while (true) {
				try {
					consSemaphore.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					store.removeItems();
					prodSemaphore.release();
		}
	}
}
