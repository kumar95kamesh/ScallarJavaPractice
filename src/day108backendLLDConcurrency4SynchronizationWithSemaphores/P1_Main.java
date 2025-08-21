package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class P1_Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/**
		 * This is not correct code.. check notes and new copied classes with 2.
		 */
		
		
		Semaphore prodSemaphore=new Semaphore(10);
		Semaphore consSemaphore=new Semaphore(0);
		ExecutorService es=Executors.newCachedThreadPool();
		P1_Store st=new P1_Store(10);
		P1_Producer producer=new P1_Producer(st,prodSemaphore,consSemaphore);
		P1_Consumer consumer=new P1_Consumer(st,prodSemaphore,consSemaphore);
		
		for(int i=0;i<15;i++) {
			es.execute(producer);
		}
		
		for(int i=0;i<25;i++) {
			es.execute(consumer);
		}
		
		es.shutdown();
	}

}
